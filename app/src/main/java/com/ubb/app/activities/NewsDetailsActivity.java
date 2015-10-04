package com.ubb.app.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ubb.app.R;
import com.ubb.app.views.NewsLayout;

public class NewsDetailsActivity extends AppCompatActivity {

    public static String BUNDLE_NEWS = "news.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final NewsLayout newsLayout = (NewsLayout) View.inflate(this, R.layout.activity_news_details, null);
        setContentView(newsLayout);

        if (getIntent().getSerializableExtra(BUNDLE_NEWS) == null) {
            finish();
            return;
        }



    }
}
