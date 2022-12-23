package com.example.sony;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sonyliv.MyMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMethod.home(MainActivity.this);
    }
}