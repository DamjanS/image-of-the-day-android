package com.android.dspevec.imageofthedaynucleus.application.di.component;


import com.android.dspevec.imageofthedaynucleus.application.ImageOfTheDayApplication;
import com.android.dspevec.imageofthedaynucleus.application.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                ApplicationModule.class
        }
)
public interface ApplicationComponent extends ApplicationComponentInjects {

    /**
     * An initializer that creates the graph from an application.
     */
    final class Initializer {
        static public ApplicationComponent init(ImageOfTheDayApplication imageOfTheDayApplication) {
            return DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(imageOfTheDayApplication))
                    .build();
        }

        private Initializer() {
        }
    }
}
