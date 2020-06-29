package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int mid, int right) {
        return max(
                left,
                max(mid, right)
        );
    }

    public static int max(int left, int mid, int right, int last) {
        return max(
                max(left, last),
                max(mid, right)
        );
    }

}