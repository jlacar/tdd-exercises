package com.siq.training;

public class TicTacToe {

	private boolean isFinished = false;
	
	public boolean isFinished() {
		return isFinished;
	}

	public void move(int position) {
		isFinished = true;
	}

	@Override
	public String toString() {
		return " X"; 
	}
}
