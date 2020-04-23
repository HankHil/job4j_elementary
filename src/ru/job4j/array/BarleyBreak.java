package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
     int[][] data = new int[3][3];
        int a = 1;
            for (int i = 0; i < 3; i++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    data[i][i2] = a;
                    a += 1;
            }
        }
    }
}