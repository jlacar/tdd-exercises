package com.siq.training;

/*
   TDD Example

   See the associated class file for a description of the
   problem we're trying to solve.

 */

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CartonCalculatorTest {

    private CartonCalculator calc;

    @Before
    public void beforeEach() {
        calc = new CartonCalculator();
    }

    @Test
    @Ignore
    public void given_N_is_the_number_of_candy_bars_to_box_up() {
        // This test is marked as "Ignored" on purpose. It is included
        // just to give some context about N referred to in the real tests
        // and to make the JUnit output read better.
        //
        // Ideally, we'd be using JUnit 5 and nested test classes
    }

    @Test
    public void when_N_is_a_multiple_of_24_then_we_should_get_N_over_24_cartons() throws Exception {
        assertThat(calc.cartonsFor(24), is(1));
    }

    @Test
    public void when_N_is_not_a_multiple_of_24_then_we_should_get_an_extra_carton_for_the_leftovers() throws Exception {
        assertThat(calc.cartonsFor(23), is(1));
        assertThat(calc.cartonsFor(25), is(2));
    }

    @Test
    public void when_N_is_zero_then_we_should_get_zero_cartons() {
        assertThat(calc.cartonsFor(0), is(0));
    }
}