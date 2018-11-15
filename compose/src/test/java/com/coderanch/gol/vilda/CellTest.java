package com.coderanch.gol.vilda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {

	@Test
    public void alive_cell_with_less_than_two_living_neighbors_dies_in_next_generation() {
        assertEquals(Cell.DEAD, Cell.inNextGeneration(Cell.ALIVE, 1));
    }

    @Test
    public void alive_cell_with_two_or_tree_living_neighbors_lives_on_in_next_generation() {
        assertEquals(Cell.ALIVE, Cell.inNextGeneration(Cell.ALIVE, 2));
        assertEquals(Cell.ALIVE, Cell.inNextGeneration(Cell.ALIVE, 3));
    }

    @Test
    public void alive_cell_with_more_than_three_living_neighbors_dies_in_next_generation() {
        assertEquals(Cell.DEAD, Cell.inNextGeneration(Cell.ALIVE, 4));
    }

    @Test
    public void dead_cell_with_three_living_neighbors_comes_to_life_in_next_generation() {
        assertEquals(Cell.ALIVE, Cell.inNextGeneration(Cell.DEAD, 3));
    }

    @Test
    public void exception_is_thrown_if_cell_instance_is_not_passed() {
    	assertThrows(NullPointerException.class, () -> {
    		Cell.inNextGeneration(null, 0);
    	});
    }

}
