package com.ubb.app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ubb.app.R;
import com.ubb.app.models.News;
import com.ubb.app.models.NewsList;
import com.ubb.app.views.AllNewsLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final AllNewsLayout allNewsLayout = (AllNewsLayout) View.inflate(this, R.layout.activity_main, null);
        setContentView(allNewsLayout);


        NewsList newsList = new NewsList();
        newsList.addNews(new News("titlu", "data", "content", "<html>"));
        newsList.addNews(new News("titlu", "data", "content", "<html>"));
        newsList.addNews(new News("titlu", "data", "content", "<html>"));
        newsList.addNews(new News("titlu", "data", "content", "<html>"));
        newsList.addNews(new News("titlu", "data", "content", "<html>"));
        newsList.addNews(new News("titlu", "data", "content", "<html>"));
        allNewsLayout.setNewsListModel(newsList);

        Toast.makeText(getApplicationContext(), "BANG", Toast.LENGTH_SHORT).show();

    }
}
