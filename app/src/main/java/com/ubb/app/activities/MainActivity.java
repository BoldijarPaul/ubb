package com.ubb.app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ubb.app.R;
import com.ubb.app.views.AllNewsLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AllNewsLayout allNewsLayout = (AllNewsLayout) View.inflate(this, R.layout.activity_main, null);
        setContentView(allNewsLayout);
    }
}
