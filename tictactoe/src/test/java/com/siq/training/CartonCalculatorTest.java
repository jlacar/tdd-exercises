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

import static com.siq.training.CartonCalculator.BARS_PER_CARTON;

public class CartonCalculatorTest {

    private CartonCalculator calc;

    @Before
    public void beforeEach() {
        calc = new CartonCalculator();
    }

    @Test
    @Ignore
    public void given_N_is_the_number_of_candy_bars_to_package() {
        /*
            DEVELOPER NOTE:

            This test is "Ignored" on purpose. It is just here to
            explain what "N" is in the real tests and to make the
            JUnit output read better.

            Ideally, we'd be using JUnit 5 and nested test classes
         */

        // Intentionally left blank
    }

    @Test
    public void BARS_PER_CARTON_should_be_24() throws Exception {
        /*
           DEVELOPER NOTE:

           The value 24 was intentionally hard-coded here to ensure
           that any direct change to the BARS_PER_CARTON constant will
           cause this test to fail. We want to ensure that any change to
           the constant is done through a deliberate Test-First approach.

           Therefore, DO NOT change the hard-coded value in the assertions
           below to use the BARS_PER_CARTON constant as that would defeat
           the purpose of this test.

           Maintain TDD discipline! If the constant's value needs to change,
           edit the hard-coded value here first to make this test fail, then
           edit the BARS_PER_CARTON constant in the production code to make
           it pass.

         */

        assertThat(calc.BARS_PER_CARTON, is(24));
    }

    @Test
    public void when_N_is_a_multiple_of_BARS_PER_CARTON_then_N_over_BARS_PER_CARTON_cartons_should_be_needed() throws Exception {
        assertThat(calc.cartonsFor(1 * BARS_PER_CARTON), is(1));
        assertThat(calc.cartonsFor(2 * BARS_PER_CARTON), is(2));
        assertThat(calc.cartonsFor(3 * BARS_PER_CARTON), is(3));
    }

    @Test
    public void when_N_is_not_a_multiple_of_BARS_PER_CARTON_then_any_leftovers_should_need_another_carton() throws Exception {
        assertThat(calc.cartonsFor(BARS_PER_CARTON - 1), is(1));
        assertThat(calc.cartonsFor(BARS_PER_CARTON + 1), is(2));
    }

    @Test
    public void when_N_is_0_then_0_cartons_should_be_needed() {
        assertThat(calc.cartonsFor(0), is(0));
    }
}