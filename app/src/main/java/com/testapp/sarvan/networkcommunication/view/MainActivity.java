package com.testapp.sarvan.networkcommunication.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.testapp.sarvan.networkcommunication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchWeatherPage(View v) {
        Intent intent = new Intent(this, ItemListActivity.class);
        startActivity(intent);
    }
}
