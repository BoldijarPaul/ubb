package com.ubb.app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import android.widget.TextView;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.R;

/**
 * Created by Browsing on 10/4/2015.
 */
public class NewsLayout extends ScrollView {

    private TextView title, content, category, date;
    private RssItem rssItem;


    public void setRssItem(RssItem rssItem) {
        this.rssItem = rssItem;
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
    }
}
