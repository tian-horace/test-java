package com.xxx.autofixjava.utils;

public class ArrayGenerator {
    public static int[][] generateRandomTwoDArray(int rows, int columns, int minValue, int maxValue) {
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }
        return arr;
    }
}
