package com.ubb.app.views;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.ubb.app.R;

/**
 * Created by Browsing on 10/3/2015.
 */
public class AllNewsLayout extends LinearLayout {

    private ListView newsListView;
    private SwipeRefreshLayout swipeRefreshLayout;

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
        newsListView = (ListView) findViewById(R.id.activity_main_listview);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_main_swiperefresh);
    }
}