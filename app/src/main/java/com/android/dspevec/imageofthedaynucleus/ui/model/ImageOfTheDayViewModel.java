package com.android.dspevec.imageofthedaynucleus.ui.model;


public final class ImageOfTheDayViewModel {

    public final String title;
    public final String link;
    public final String description;
    public final String pubDate;
    public final boolean isPermalink;
    public final String guId;
    public final String source;

    public ImageOfTheDayViewModel(String title, String link, String description,
                                  String pubDate, boolean isPermalink, String guId,
                                  String source) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
        this.isPermalink = isPermalink;
        this.guId = guId;
        this.source = source;
    }
}
