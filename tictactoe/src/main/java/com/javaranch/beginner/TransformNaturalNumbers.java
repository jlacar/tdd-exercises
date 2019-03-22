package com.javaranch.beginner;

import java.util.HashSet;
import java.util.Set;

public class FindTheSummedNumber {

    Set<Integer> newNumbers = new HashSet<>();

    public FindTheSummedNumber(int max) {
        for (int i = 0; i < max; i++) {
            newNumbers.add(transform(i+1));
        }
    }

    private Integer transform(int i) {
        return i + sumOfDigits(i);
    }

    private int sumOfDigits(int i) {
        int sum = 0;
        int remaining = i;
        while (remaining > 0) {
            sum += remaining % 10;
            remaining /= 10;
        }
        return sum;
    }

    public boolean contains(int i) {
        return newNumbers.contains(i);
    }
}
