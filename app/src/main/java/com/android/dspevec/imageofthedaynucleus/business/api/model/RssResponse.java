package com.android.dspevec.imageofthedaynucleus.business.api.model;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss")
public final class RssResponse {

    @Element(name = "channel")
    public RssChannel channel;

    @Attribute(name = "version", required = false)
    public String version;

    public RssResponse() {
    }
}
