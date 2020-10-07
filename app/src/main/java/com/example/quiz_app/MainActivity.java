package com.example.quiz_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MyAnswers myAnswers = new MyAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(add(2,2));
        System.out.println("State: " + savedInstanceState);
        // setContentView is a method that will tell the activity to use '/res/layout/activity_main.xml' as the layout
        setContentView(R.layout.activity_main);
        // Declare view variables and assign them the views from the layout file
        final TextView answerLabel = findViewById(R.id.TextView1);
        Button getAnswerButton = findViewById(R.id.Button1);
        getAnswerButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println(add(100,100));
                        String answer = myAnswers.getAnAnswer();
                        System.out.println(answer);
                        answerLabel.setText(answer);
                    }
                }
        );

    }

    public static int add(int a, int b) {
        return a + b;
    }

}