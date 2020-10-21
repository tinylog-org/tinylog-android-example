package com.example.tinylog.demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import org.tinylog.Logger;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        File directoryForLogs = getExternalFilesDir(null);
        System.setProperty("tinylog.directory", directoryForLogs.getAbsolutePath());

        Logger.info("Hello World!");
        Logger.info("Logs can be found in \"{}\"", directoryForLogs);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }

}
