package com.siq.training;

import java.util.Arrays;

public class TicTacToe {

    private boolean isFinished = false;

    private char[] spaces = new char[9];

    {
        Arrays.fill(spaces, ' ');
    }

    private char whosMoving = 'X';

    public boolean isFinished() {
        return isFinished;
    }

    public void move(int position) {
        spaces[position - 1] = whosMoving;
        switchPlayer();
        isFinished = true;
    }

    private void switchPlayer() {
        whosMoving = (whosMoving == 'X') ? 'O' : 'X';
    }

    @Override
    public String toString() {
        return String.valueOf(spaces);
    }
}
