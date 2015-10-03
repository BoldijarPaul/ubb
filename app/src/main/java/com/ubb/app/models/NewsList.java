package com.ubb.app.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Browsing on 10/3/2015.
 */
public class NewsList extends Observable {
    private List<News> news = new ArrayList<>();

    public void setNews(List<News> news) {
        this.news = news;
        setChanged();
        notifyObservers();
    }

    public void addNews(List<News> news) {
        this.news.addAll(news);
        setChanged();
        notifyObservers();
    }

    public void addNews(News news) {
        this.news.add(news);
        setChanged();
        notifyObservers();
    }

    public List<News> getNews() {
        return news;
    }
}
