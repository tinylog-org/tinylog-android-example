package com.example.tinylog.demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import org.tinylog.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Logger.info("Hello World!");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }

}
