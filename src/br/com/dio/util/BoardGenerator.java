package br.com.dio.util;

import br.com.dio.model.Space;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoardGenerator {
/*
    private static final int SIZE = 9;

    public static List<List<Space>> generatePlayableBoard(int clues) {
        int[][] solved = SudokuGenerator.generateSolvedBoard();

        int[][] board = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.arraycopy(solved[i], 0, board[i], 0, SIZE);
        }

        List<int[]> positions = new ArrayList<>();
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                positions.add(new int[]{i, j});

        Collections.shuffle(positions);

        int cellsToRemove = SIZE * SIZE - clues;
        for (int i = 0; i < cellsToRemove; i++) {
            int[] pos = positions.get(i);
            board[pos[0]][pos[1]] = 0;
        }

        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            List<Space> row = new ArrayList<>();
            for (int j = 0; j < SIZE; j++) {
                Integer value = (board[i][j] == 0) ? null : board[i][j];
                boolean fixed = value != null;
                row.add(new Space(value, fixed));
            }
            spaces.add(row);
        }

        return spaces;
    }
 */
}