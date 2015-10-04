package com.ubb.app.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ubb.app.R;

/**
 * Created by Browsing on 10/4/2015.
 */
public class NewsViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView content;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.item_news_title);
        content = (TextView) itemView.findViewById(R.id.item_news_content);
    }
}
