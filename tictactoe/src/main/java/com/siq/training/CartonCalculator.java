package com.siq.training;

/*
    TDD Example

    Problem: How many cartons are needed to package N candy bars?

    Given:
       Each carton can hold up to 24 candy bars

    Examples:
       1 carton needed to package 1 to 23 candy bars
       1 carton needed to package 24 candy bars
       2 cartons needed to package 25 to 48 candy bars
*/

public class CartonCalculator {

    private static final int BARS_PER_CARTON = 24;

    public int cartonsFor(int candyBars) {
        return fullCartonsOf(candyBars) + cartonForAnyLeftover(candyBars);
    }

    private int cartonForAnyLeftover(int candyBars) {
        return hasLeftover(candyBars) ? 1 : 0;
    }

    private int fullCartonsOf(int candyBars) {
        return candyBars / BARS_PER_CARTON;
    }

    private boolean hasLeftover(int candyBars) {
        return leftover(candyBars) != 0;
    }

    private int leftover(int candyBars) {
        return candyBars % BARS_PER_CARTON;
    }

}