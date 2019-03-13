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
		game.move(1);
		game.move(4);
		game.move(2);
		game.move(5);
		game.move(3);
		
		assertThat(game.isFinished(), is(true));
	}

	@Test
	public void when_any_player_wins_a_row_then_game_is_finished() throws Exception {
		game.move(4);
		game.move(1);
		game.move(5);
		game.move(2);
		game.move(6);

		assertThat(game.isFinished(), is(true));

	}

	/*
	DRY = Don't Repeat Yourself

	There should only be one representation of any piece of knowledge
	in your system.

	Pragmatic Programmer - From Journeyman To Master
	By Dave Thomas and Andrew Hunt
	 */


	@Test
	public void game_is_over_when_all_locations_are_taken() {
		game.move(2);
		game.move(1);
		game.move(4);
		game.move(3);
		game.move(5);
		game.move(6);
		game.move(7);
		game.move(8);
		game.move(9);
		
		assertThat(game.isFinished(), is(true));
	}
	
	@Test
	public void first_player_to_move_should_be_X() throws Exception {
		game.move(2);
		
		assertTrue(game.toString().startsWith(" X"));
	}
	
	@Test
	public void second_player_to_move_should_be_O() throws Exception {
		game.move(2);
		game.move(1);
		
		assertTrue(game.toString().startsWith("OX"));
	}

	@Test
	public void game_should_not_be_finished_after_first_move() {
		game.move(2);

		assertThat(game.isFinished(), is(false));
	}


}
