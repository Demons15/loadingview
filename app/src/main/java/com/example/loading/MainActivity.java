package com.example.loading;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.wang.avi.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {
    private AVLoadingIndicatorView custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom = (AVLoadingIndicatorView) findViewById(R.id.custom_loading);
        custom.setIndicator("com.wang.avi.CustomLoadingIndicator");
        custom.setIndicatorColor(Color.parseColor("#333333"));
        custom.show();
    }
}
