package com.android.dspevec.imageofthedaynucleus.business.api.model;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item")
public final class RssItem {

    @Element(name = "title")
    public String title;

    @Element(name = "link")
    public String link;

    @Element(name = "description")
    public String description;

    @Element(name = "enclosure")
    public RssEnclosure enclosure;

    @Element(name = "pubDate")
    public String pubDate;

    @Element(name = "guid")
    public RssGuId guId;

    @Element(name = "source")
    public String source;

    public RssItem() {
    }
}
