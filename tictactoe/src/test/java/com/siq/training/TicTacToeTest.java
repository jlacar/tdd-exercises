package com.siq.training;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Ignore;
import org.junit.Test;

public class TicTacToeTest {

	private TicTacToe game;

	// Game loop
	// while game not finished
	//    player makes move
	//        If won, done
	//    	  If no moves left, draw
	//    show the board
	//    switch players
	// end loop
	// show result: win (X or O) or draw

    private static final int[] X_wins_in_first_row = {1, 4, 2, 5, 3};
    private static final int[] X_wins_in_second_row = {4, 1, 5, 2, 6};
    private static final int[] cats_game = {2, 1, 4, 3, 5, 6, 7, 8, 9};

    private void play(int... moves) {
        for (int position : moves) {
            game.move(position);
        }
    }

	@Before
	public void setup() {
		game = new TicTacToe();
	}

	@Test
	public void when_game_starts_then_the_game_is_not_finished() {
		assertThat(game.isFinished(), is(false));
	}

	@Test
	public void when_X_wins_then_game_is_finished() throws Exception {
	    play(X_wins_in_first_row);

		assertThat(game.isFinished(), is(true));
	}

    @Test
	public void when_any_player_wins_a_row_then_game_is_finished() throws Exception {
        play(X_wins_in_second_row);

		assertThat(game.isFinished(), is(true));
	}

	@Test
	public void game_is_over_when_all_locations_are_taken() {
        play(cats_game);

        assertThat(game.isFinished(), is(true));
	}

    @Test
	public void first_player_to_move_should_be_X() throws Exception {
		play(2);
		
		assertTrue(game.toString().startsWith(" X"));
	}
	
	@Test
	public void second_player_to_move_should_be_O() throws Exception {
        play(2, 1);

		assertTrue(game.toString().startsWith("OX"));
	}

	@Test
	public void game_should_not_be_finished_after_first_move() {
		play(2);

		assertThat(game.isFinished(), is(false));
	}

}
