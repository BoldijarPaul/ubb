package com.ubb.app.models;

import com.shirwa.simplistic_rss.RssItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Browsing on 10/3/2015.
 */
public class NewsList extends Observable {
    private List<RssItem> news = new ArrayList<>();

    public void setRssItem(List<RssItem> news) {
        this.news = news;
        setChanged();
        notifyObservers();
    }

    public void addRssItem(List<RssItem> news) {
        this.news.addAll(news);
        setChanged();
        notifyObservers();
    }

    public void addRssItem(RssItem news) {
        this.news.add(news);
        setChanged();
        notifyObservers();
    }

    public List<RssItem> getRssItem() {
        return news;
    }
}
