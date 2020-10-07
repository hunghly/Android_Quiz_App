package com.example.quiz_app;

import java.util.Random;

public class MyAnswers {

    public String[] mAnswers = {
            "Apple",
            "Mango",
            "Orange",
            "Banana",
            "Strawberry",
    };

    public String getAnAnswer() {
        String answer = " ";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mAnswers.length);
        answer = mAnswers[randomNumber];

        return answer;
    }
}
