package kr.codesquad;

import java.util.Arrays;

public class LadderMaker {

    private int participants;
    private int height;
    String[][] ladder;

    public LadderMaker(int participants, int height) {
        this.participants = participants;
        this.height = height;

        this.ladder = new String[height][participants * 2 - 1];
        makeLadder();
    }

    public void makeLadder() {

        String[][] ladder = new String[participants][height];

        for (int i = 0; i < ladder.length; i++) {
            Arrays.fill(ladder[i], " ");
        }

        insertLines();

    }

    private void insertLines() {
        for (int row = 0; row < ladder.length; row++) {
            validationEachRow(row);
        }
    }

    private void validationEachRow(int row) {
        for (int col = 0; col < ladder[0].length; col++) {
            validationEachCol(row, col);
        }
    }

    private void validationEachCol(int row, int col) {
        if (col % 2== 0) {
            ladder[row][col] = "|";
        }
    }
}
