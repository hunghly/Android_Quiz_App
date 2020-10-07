package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(add(2,2));
        System.out.println("State: " + savedInstanceState);
        // setContentView is a method that will tell the activity to use '/res/layout/activity_main.xml' as the layout
        setContentView(R.layout.activity_main);


    }

    public static int add(int a, int b) {
        return a + b;
    }

}