package com.example.quiz_app;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

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
        final Switch onOffSwitch = findViewById(R.id.Switch1);
        final ConstraintLayout layout = findViewById(R.id.main_layout);



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

        onOffSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked Switch On: " + onOffSwitch.getTextOn());
                System.out.println("Clicked Switch Off: " + onOffSwitch.getTextOff());
                System.out.println("Current Text: " + onOffSwitch.getText());
                System.out.println("Current State: " + onOffSwitch.isChecked());
                if (onOffSwitch.isChecked()) {
                    layout.setBackgroundColor(Color.parseColor("#333333"));
                } else {
                    layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        });

    }

    public static int add(int a, int b) {
        return a + b;
    }

}