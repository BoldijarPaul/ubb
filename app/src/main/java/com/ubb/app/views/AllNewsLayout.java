package com.ubb.app.views;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.ubb.app.R;
import com.ubb.app.models.NewsList;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Browsing on 10/3/2015.
 */
public class AllNewsLayout extends LinearLayout implements Observer {

    private SwipeRefreshLayout swipeRefreshLayout;

    private NewsList newsListModel;

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

    public void setNewsListModel(NewsList newsListModel) {
        this.newsListModel = newsListModel;
        this.newsListModel.addObserver(this);
        updateView();
    }

    private void initializeLayout() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_main_swiperefresh);


    }

    public void updateView() {
    }

    @Override
    public void update(Observable observable, Object data) {
        updateView();

    }
}
