package com.siq.training;

import java.util.Arrays;

public class TicTacToe {

    private char[] spaces = new char[9];

    {
        Arrays.fill(spaces, ' ');
    }

    private char whosMoving = 'X';

    public boolean isFinished() {
        return hasWinner() || isDraw();
    }

    private boolean isDraw() {
        return toString().indexOf(' ') == -1;
    }

    private boolean hasWinner() {
        return wonRow1() || wonRow2();
    }

    private boolean wonRow1() {
        return toString().startsWith("XXX");
    }

    private boolean wonRow2() {
        return toString().contains("XXX");
    }

    public void move(int position) {
        mark(position);
        switchPlayer();
    }

    private void mark(int position) {
        spaces[position - 1] = whosMoving;
    }

    private void switchPlayer() {
        whosMoving = (whosMoving == 'X') ? 'O' : 'X';
    }

    @Override
    public String toString() {
        return String.valueOf(spaces);
    }
}
