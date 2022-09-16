package com.maxjacobi.randomnamegenerator;

import java.util.Random;

//TODO add intelligent vocal placement

public class RandomName {
    final String chars = "abcdefghijklmnopqrstuvwxyz";
    final String vocals = "aeiou";
    final Random random = new Random();

    String name;

    public RandomName(int length) {
        StringBuilder builder = new StringBuilder();
        boolean vocalBefore = false;
        for(int i = 0; i <= length; i++) {
            if (vocalBefore) {
                builder.append(chars.charAt(random.nextInt(chars.length())));
                vocalBefore = false;
            } else {
                builder.append(vocals.charAt(random.nextInt(vocals.length())));
                vocalBefore = true;
            }
        }
        name = builder.toString();
    }

    public String getName() {
        return name;
    }
}
