package com.maxjacobi.randomnamegenerator;

import java.util.Random;

//TODO add intelligent vocal placement

public class RandomName {
    final String chars = "abcdefghijklmnopqrstuvwxyz";
    final Random random = new Random();

    String name;

    public RandomName(int length) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <= length; i++) {
            builder.append(chars.charAt(random.nextInt(chars.length())));
        }
        name = builder.toString();
    }

    public String getName() {
        return name;
    }
}
