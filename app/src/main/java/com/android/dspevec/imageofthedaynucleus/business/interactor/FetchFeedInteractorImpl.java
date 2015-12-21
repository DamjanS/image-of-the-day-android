package com.android.dspevec.imageofthedaynucleus.business.interactor;


import com.android.dspevec.imageofthedaynucleus.business.api.ContentApi;
import com.android.dspevec.imageofthedaynucleus.business.api.model.RssResponse;
import com.android.dspevec.imageofthedaynucleus.ui.model.ImageOfTheDayViewModel;
import com.squareup.otto.Bus;


import java.util.List;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public final class FetchFeedInteractorImpl implements FetchFeedInteractor {

    private final ContentApi contentApi;
    private final Bus bus;

    public FetchFeedInteractorImpl(ContentApi contentApi, Bus bus) {
        this.contentApi = contentApi;
        this.bus = bus;
    }

    @Override
    public void fetchRemoteFeed() {
        contentApi.downloadFeed(new Callback<RssResponse>() {

            @Override
            public void onResponse(Response<RssResponse> response, Retrofit retrofit) {
                Observable.defer(() -> updateFeedDatabase(response.body()))
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                FetchFeedInteractorImpl.this::fireUpdateFeedFinished,
                                FetchFeedInteractorImpl.this::fireUpdateFeedError);
            }

            @Override
            public void onFailure(Throwable error) {
                fireDownloadFeedError(error.getMessage());
            }
        });
    }

    @Override
    public Observable<List<ImageOfTheDayViewModel>> refreshRemoteFeed() {
        return null;
    }

    @Override
    public Observable<List<ImageOfTheDayViewModel>> fetchLocalFeed() {
        return null;
    }

    @Override
    public Observable<ImageOfTheDayViewModel> fetchFeedItemForDate() {
        return null;
    }


    private void fireDownloadFeedError(String message) {
    }

    private void fireUpdateFeedFinished(Boolean aBoolean) {
    }

    private Observable<Boolean> updateFeedDatabase(final RssResponse rssResponse) {

        return null;
    }

    private void fireUpdateFeedError(Throwable throwable) {
    }
}
