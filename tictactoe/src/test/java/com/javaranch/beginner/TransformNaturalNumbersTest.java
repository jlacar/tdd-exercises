package com.javaranch.beginner;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class FindTheSummedNumberTest {

    private FindTheSummedNumber newNumbers;

    @Before
    public void setUp() throws Exception {
        newNumbers = new FindTheSummedNumber(2000);
    }

    @Test
    public void should_find_119() throws Exception {
        assertThat(newNumbers.contains(119), is(true));
    }

    @Test
    public void should_not_find_3() throws Exception {
        assertThat(newNumbers.contains(3), is(false));
    }

    @Test
    public void should_not_find_1311() throws Exception {
        assertThat(newNumbers.contains(1311), is(false));
    }
}