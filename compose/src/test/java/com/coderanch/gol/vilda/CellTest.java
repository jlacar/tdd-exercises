package com.coderanch.gol.vilda;

import static com.coderanch.gol.vilda.Cell.ALIVE;
import static com.coderanch.gol.vilda.Cell.DEAD;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class CellTest {

	@Test
	void it_survives_with_2_neighbors() throws Exception {
		assertThat(ALIVE.next(2), is(ALIVE));
	}
	
	@Test
	void it_survives_with_3_neighbors() throws Exception {
		assertThat(ALIVE.next(3), is(ALIVE));
	}
	
    @Test
	void it_dies_of_loneliness() throws Exception {
    	assertThat(ALIVE.next(0), is(DEAD));
		assertThat(ALIVE.next(1), is(DEAD));
	}
    
    @Test
	void it_dies_of_overcrowding() throws Exception {
    	assertThat(ALIVE.next(4), is(DEAD));
    	assertThat(ALIVE.next(5), is(DEAD));
    	assertThat(ALIVE.next(6), is(DEAD));
    	assertThat(ALIVE.next(7), is(DEAD));
    	assertThat(ALIVE.next(8), is(DEAD));
	}
    
    @Test
	void it_is_born_when_dead_and_exactly_3_neighbors() throws Exception {
    	assertThat(DEAD.next(3), is(ALIVE));
	}
}
