package com.ubb.app.service;

import android.os.AsyncTask;

import com.shirwa.simplistic_rss.RssItem;
import com.shirwa.simplistic_rss.RssReader;

import java.util.List;

/**
 * Created by Browsing on 10/4/2015.
 */
public class RSSLoader {

    private static final String RSS_URL = "http://www.cs.ubbcluj.ro/feed/";

    public static void getRSSItems(final RSSLoaderCallback callback) {
        new AsyncTask<Void, Void, List<RssItem>>() {
            @Override
            protected List<RssItem> doInBackground(Void... params) {
                RssReader rssReader = new RssReader(RSS_URL);
                try {
                    return rssReader.getItems();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            protected void onPostExecute(List<RssItem> rssItems) {
                callback.onGetRSS(rssItems);
            }
        }.execute();
    }
}
