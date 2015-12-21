package com.android.dspevec.imageofthedaynucleus.business.interactor;


import com.android.dspevec.imageofthedaynucleus.ui.model.ImageOfTheDayViewModel;

import java.util.List;

import rx.Observable;

public interface FetchFeedInteractor {

    void fetchRemoteFeed();

    Observable<List<ImageOfTheDayViewModel>> refreshRemoteFeed();

    Observable<List<ImageOfTheDayViewModel>> fetchLocalFeed();

    Observable<ImageOfTheDayViewModel> fetchFeedItemForDate();
}
