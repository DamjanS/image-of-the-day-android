package com.android.dspevec.imageofthedaynucleus.business.api.model;


import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "channel")
public final class RssChannel {

    @ElementList(inline = true)
    public List<RssItem> items;

    public RssChannel() {
    }
}
