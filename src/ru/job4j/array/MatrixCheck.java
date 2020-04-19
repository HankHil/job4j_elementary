package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            char temp = board[row][0];
            if (temp != board[row][index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}