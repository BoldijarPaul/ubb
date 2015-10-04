package com.ubb.app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.R;
import com.ubb.app.service.RSSLoader;
import com.ubb.app.service.RSSLoaderCallback;
import com.ubb.app.views.AllNewsLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final AllNewsLayout allNewsLayout = (AllNewsLayout) View.inflate(this, R.layout.activity_main, null);
        setContentView(allNewsLayout);





    }
}
