package com.android.dspevec.imageofthedaynucleus.application.di.module;

import android.content.Context;

import com.android.dspevec.imageofthedaynucleus.application.ImageOfTheDayApplication;
import com.android.dspevec.imageofthedaynucleus.application.di.qualifier.ForApplication;
import com.android.dspevec.imageofthedaynucleus.business.api.ContentApi;
import com.android.dspevec.imageofthedaynucleus.config.Urls;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.otto.Bus;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;
import retrofit.SimpleXmlConverterFactory;


@Module
public final class ApplicationModule {

    private static final int TIMEOUT = 5 * 60 * 1000;

    private final ImageOfTheDayApplication imageOfTheDayApplication;

    public ApplicationModule(ImageOfTheDayApplication imageOfTheDayApplication) {
        this.imageOfTheDayApplication = imageOfTheDayApplication;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return this.imageOfTheDayApplication;
    }

    @Provides
    @Singleton
    Bus provideBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    SimpleXmlConverterFactory provideSimpleXmlConverter() {
        return SimpleXmlConverterFactory.create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(TIMEOUT, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(TIMEOUT, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(TIMEOUT, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    @Provides
    @Singleton
    ContentApi provideContentApi(OkHttpClient okHttpClient, SimpleXmlConverterFactory simpleXmlConverterFactory) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.NASA_URL)
                .client(okHttpClient)
                .addConverterFactory(simpleXmlConverterFactory)
                .build();
        return retrofit.create(ContentApi.class);
    }
}
