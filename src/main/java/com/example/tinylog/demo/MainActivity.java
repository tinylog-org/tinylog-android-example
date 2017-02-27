package com.example.tinylog.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.pmw.tinylog.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Logger.info("Hello World!");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
