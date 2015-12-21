package com.android.dspevec.imageofthedaynucleus.business.dao;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = ImageOfTheDayDatabase.NAME, version = ImageOfTheDayDatabase.VERSION)
public final class ImageOfTheDayDatabase {

    public static final String NAME = "ImageOfTheDay";
    public static final int VERSION = 1;
}
