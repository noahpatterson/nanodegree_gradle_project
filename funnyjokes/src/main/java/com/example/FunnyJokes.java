package com.example;

import java.util.Random;

public class FunnyJokes {
    private static String[] jokes = {"Why do chicken coops only have two doors? Because if they had four, they would be chicken sedans!",
                                     "Why did the Clydesdale give the pony a glass of water? Because he was a little horse!",
                                     "Two peanuts were walking down the street. One was a salted."};

    public static String getjoke() {
        Random random = new Random();
        int jokesLen = jokes.length;
        int randIndex = random.nextInt(jokesLen);

        return jokes[randIndex];
    }

}
