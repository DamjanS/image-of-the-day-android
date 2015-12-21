package com.android.dspevec.imageofthedaynucleus.business.dao.model;

import com.android.dspevec.imageofthedaynucleus.business.dao.ImageOfTheDayDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(databaseName = ImageOfTheDayDatabase.NAME)
public final class ImageOfTheDayDbModel extends BaseModel {

    @Column
    @PrimaryKey
    public long id;

    @Column
    private String title;

    @Column
    private String link;

    @Column
    private String description;

    @Column
    private String pubDate;

    @Column
    private boolean isPermalink;

    @Column
    private String guId;

    @Column
    private String source;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public boolean isPermalink() {
        return isPermalink;
    }

    public void setIsPermalink(boolean isPermalink) {
        this.isPermalink = isPermalink;
    }

    public String getGuId() {
        return guId;
    }

    public void setGuId(String guId) {
        this.guId = guId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
