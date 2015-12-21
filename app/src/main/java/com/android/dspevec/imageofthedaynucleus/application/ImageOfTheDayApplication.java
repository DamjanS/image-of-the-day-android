package com.android.dspevec.imageofthedaynucleus.application;

import android.app.Application;

import com.android.dspevec.imageofthedaynucleus.application.di.component.ApplicationComponent;

public class ImageOfTheDayApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = ApplicationComponent.Initializer.init(this);
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
