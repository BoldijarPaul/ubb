package com.ubb.app.views;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.R;
import com.ubb.app.activities.NewsDetailsActivity;
import com.ubb.app.adapters.NewsAdapter;
import com.ubb.app.interfaces.NewsClickListener;
import com.ubb.app.service.RSSLoader;
import com.ubb.app.service.RSSLoaderCallback;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Browsing on 10/3/2015.
 */
public class AllNewsLayout extends LinearLayout implements Observer, NewsClickListener {

    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView recyclerView;


    public AllNewsLayout(Context context) {
        super(context);
    }

    public AllNewsLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AllNewsLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        /* everything finished inflating , initialize layout*/
        initializeLayout();
    }


    private void initializeLayout() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_main_swiperefresh);
        recyclerView = (RecyclerView) findViewById(R.id.activity_main_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        RSSLoader.getRSSItems(new RSSLoaderCallback() {
            @Override
            public void onGetRSS(List<RssItem> items) {
                NewsAdapter adapter = new NewsAdapter();
                adapter.setItems(items);
                adapter.setOnNewsClickListener(AllNewsLayout.this);
                recyclerView.setAdapter(adapter);

            }
        });


    }

    public void updateView() {
    }

    @Override
    public void update(Observable observable, Object data) {
        updateView();

    }

    @Override
    public void onNewsClick(RssItem item) {
        /* clicked a news */
        Intent intent = new Intent(getContext(), NewsDetailsActivity.class);
        intent.putExtra(NewsDetailsActivity.BUNDLE_NEWS, item);
        getContext().startActivity(intent);
    }
}
