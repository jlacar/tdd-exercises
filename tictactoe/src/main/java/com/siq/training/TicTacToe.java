package com.siq.training;

import java.util.Arrays;

public class TicTacToe {

    private char[] spaces = new char[9];

    {
        Arrays.fill(spaces, ' ');
    }

    private char whosMoving = 'X';

    public boolean isFinished() {
        return toString().indexOf(' ') == -1;
    }

    public void move(int position) {
        spaces[position - 1] = whosMoving;
        switchPlayer();
    }

    private void switchPlayer() {
        whosMoving = (whosMoving == 'X') ? 'O' : 'X';
    }

    @Override
    public String toString() {
        return String.valueOf(spaces);
    }
}
