package com.ubb.app.service;

import com.shirwa.simplistic_rss.RssItem;

import java.util.List;

/**
 * Created by Browsing on 10/4/2015.
 */
public interface RSSLoaderCallback {
    public List<RssItem> onGetRSS();
}
