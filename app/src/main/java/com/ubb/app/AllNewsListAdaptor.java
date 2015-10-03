package com.ubb.app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ubb.app.models.News;
import com.ubb.app.models.NewsList;

/**
 * Created by Browsing on 10/3/2015.
 */
public class AllNewsListAdaptor extends BaseAdapter {
    private NewsList newsList;
    private Context context;

    public AllNewsListAdaptor(NewsList newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }


    public void setNewsList(NewsList newsList) {
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.getNews().size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.getNews().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        NewsViewHolder newsViewHolder;
        if (convertView == null) {
            // inflate the layout

            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_news, parent, false);


            // well set up the ViewHolder
            newsViewHolder=new NewsViewHolder();
            newsViewHolder.content= (TextView) convertView.findViewById(R.id.item_news_content);
            newsViewHolder.title= (TextView) convertView.findViewById(R.id.item_news_title);

            // store the holder with the view.
            convertView.setTag(newsViewHolder);
        } else {
            newsViewHolder = (NewsViewHolder) convertView.getTag();
        }

        News news = (News) getItem(position);
        newsViewHolder.title.setText(news.getTitle());
        newsViewHolder.content.setText(news.getContent());
        return null;
    }

    public static class NewsViewHolder {
        public TextView title, content;
    }
}
