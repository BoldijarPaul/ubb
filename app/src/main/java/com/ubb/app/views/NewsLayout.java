package com.ubb.app.views;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.ScrollView;
import android.widget.TextView;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.R;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Browsing on 10/4/2015.
 */
public class NewsLayout extends ScrollView implements Observer {

    private TextView title, content, category, date;
    private RssItem rssItem;


    public void setRssItem(RssItem rssItem) {
        this.rssItem = rssItem;
        rssItem.addObserver(this);
    }

    public RssItem getRssItem() {
        return rssItem;
    }

    public NewsLayout(Context context) {
        super(context);
    }

    public NewsLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NewsLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        title = (TextView) findViewById(R.id.activity_news_details_title);
        category = (TextView) findViewById(R.id.activity_news_details_category);
        date = (TextView) findViewById(R.id.activity_news_details_date);
        content = (TextView) findViewById(R.id.activity_news_details_content);

        updateView();
    }

    @Override
    public void update(Observable observable, Object data) {
        updateView();
    }

    private void updateView() {
        if (rssItem != null) {
            title.setText(rssItem.getTitle());
            date.setText(rssItem.getPubDate());
            content.setText(Html.fromHtml(rssItem.getContentEncoded()));
            category.setText(rssItem.getCategory());
        }
    }
}
