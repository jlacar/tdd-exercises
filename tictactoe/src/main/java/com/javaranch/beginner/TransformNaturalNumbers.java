package com.javaranch.beginner;

import java.util.*;
import java.util.stream.IntStream;

public class TransformNaturalNumbers {

    BitSet newNumbers = new BitSet();

    public TransformNaturalNumbers() {}

    public TransformNaturalNumbers(int max) {}

    private static Integer transform(int i) {
        return i + sumOfDigits(i);
    }

    private static int sumOfDigits(int i) {
        int sum = 0;
        int remaining = i;
        while (remaining > 0) {
            sum += remaining % 10;
            remaining /= 10;
        }
        return sum;
    }

    public boolean includes(Integer i) {
        if (newNumbers.get(i))
            return true;

        possibleOrigins(i)
                .map(TransformNaturalNumbers::transform)
                .filter(i::equals)
                .forEach(newNumbers::set);

        return newNumbers.get(i);
    }

    public static boolean includesStream(Integer i) {
        return possibleOrigins(i)
                .map(TransformNaturalNumbers::transform)
                .filter(i::equals)
                .findFirst()
                .isPresent();
    }

    private static IntStream possibleOrigins(int i) {
        return IntStream.range(lowerBoundFor(i), i);
    }

    private static int lowerBoundFor(int i) {
        int maxDigitSum = 9 * numberOfDigitsIn(i);
        return Math.max(1, i - maxDigitSum);
    }

    private static int numberOfDigitsIn(int i) {
        int n = 0;
        int remaining = i;
        while (remaining > 0) {
            n++;
            remaining /= 10;
        }
        return n;
    }
}

/*
        // constructor
        for (int i = 0; i < max; i++) {
            newNumbers.add(transform(i+1));
        }

        IntStream.rangeClosed(1, max)
                .forEach(i -> newNumbers.add(transform(i)));

//        List<Integer> transforms = new ArrayList<>();
//        OptionalInt match = IntStream.rangeClosed(Math.max(1, i - 81), i)
//                .filter(n -> {
//                    int newNum = transform(n);
//                    transforms.add(newNum);
//                    if (newNum == i) {
//                        System.out.printf("transform(%d) == %d%n", n, i);
//                    }
//                    return newNum == i;
//                }).findFirst();
//
//        System.out.println(transforms);
//        return match.isPresent();
 */