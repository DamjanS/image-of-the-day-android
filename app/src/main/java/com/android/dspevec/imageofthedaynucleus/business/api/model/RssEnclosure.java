package com.android.dspevec.imageofthedaynucleus.business.api.model;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "enclosure")
public final class RssEnclosure {

    @Attribute(name = "url")
    public String url;

    @Attribute(name = "length")
    public int length;

    @Attribute(name = "type")
    public String type;

    public RssEnclosure() {
    }
}
