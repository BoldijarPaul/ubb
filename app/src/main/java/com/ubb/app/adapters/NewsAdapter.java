package com.ubb.app.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.R;
import com.ubb.app.models.NewsList;
import com.ubb.app.viewholders.NewsViewHolder;

import java.util.List;

/**
 * Created by Browsing on 10/4/2015.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private NewsList newsList = new NewsList();

    public void setNewsList(NewsList newsList) {
        this.newsList = newsList;
    }

    public NewsList getNewsList() {
        return newsList;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, null);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        RssItem item = newsList.getRssItem().get(position);

        holder.title.setText(item.getTitle());
        holder.content.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {
        return newsList.getRssItem().size();
    }
}
