package com.android.dspevec.imageofthedaynucleus.business.api;

import com.android.dspevec.imageofthedaynucleus.business.api.model.RssChannel;
import com.android.dspevec.imageofthedaynucleus.business.api.model.RssResponse;

import retrofit.Callback;
import retrofit.http.GET;
import rx.Observable;

public interface ContentApi {

    @GET("rss/dyn/image_of_the_day.rss")
    Observable<RssChannel> downloadFeed(Callback<RssResponse> callback);
}
