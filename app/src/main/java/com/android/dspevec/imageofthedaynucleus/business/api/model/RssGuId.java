package com.android.dspevec.imageofthedaynucleus.business.api.model;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "guid")
public final class RssGuId {

    @Attribute(name = "isPermalink")
    public boolean isPermalink;

    @Text
    public String guid;
}
