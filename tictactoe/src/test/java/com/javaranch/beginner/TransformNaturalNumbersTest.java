package com.javaranch.beginner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TransformNaturalNumbersTest {

    private TransformNaturalNumbers newNumbers;

    @Before
    public void setup() {
        newNumbers = new TransformNaturalNumbers();
    }

    @Test
    public void should_not_find_3() throws Exception {
        assertThat(newNumbers.includes(3), is(false));
    }

    @Test
    public void should_find_119() throws Exception {
        assertThat(newNumbers.includes(119), is(true));
    }

    @Test
    public void should_not_find_1311() throws Exception {
        assertThat(newNumbers.includes(1311), is(false));
    }

    @Test
    public void both_approaches_should_match() throws Exception {
        assertThat(newNumbers.includes(987_654),
                is(TransformNaturalNumbers.includesStream(987_654)));

        assertThat(newNumbers.includes(987_650),
                is(TransformNaturalNumbers.includesStream(987_650)));
    }

    @Test
    public void should_handle_big_numbers_with_stream_approach() throws Exception {
        assertThat(TransformNaturalNumbers.includesStream(987_654_321), is(true));
        assertThat(TransformNaturalNumbers.includesStream(987_654_300), is(true));
    }

    @Test
    public void should_handle_big_number_with_set_approach() throws Exception {
        assertThat(newNumbers.includes(987_654_321), is(true));
        assertThat(newNumbers.includes(987_654_300), is(true));
    }

//    @Test
    public void lowerBound_100() throws Exception {
        assertThat(lowerBoundFor(1000), is(10));
    }

//    @Test
    public void numberOfDigits() throws Exception {
        assertThat(numberOfDigitsIn(1), is(1));
        assertThat(numberOfDigitsIn(9), is(1));
        assertThat(numberOfDigitsIn(10), is(2));
        assertThat(numberOfDigitsIn(99), is(2));
        assertThat(numberOfDigitsIn(100), is(3));
        assertThat(numberOfDigitsIn(999), is(3));
        assertThat(numberOfDigitsIn(1000), is(4));
        assertThat(numberOfDigitsIn(9999), is(4));
        assertThat(numberOfDigitsIn(10000), is(5));
        assertThat(numberOfDigitsIn(99999), is(5));
        assertThat(numberOfDigitsIn(1_000_000_000), is(10));
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