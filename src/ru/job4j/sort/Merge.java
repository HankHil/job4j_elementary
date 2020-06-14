package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;
        while (l < left.length && r < right.length) {
            rsl[i++] = left[l] < right[r] ? left[l++] : right[r++];
        }
        while (l < left.length) {
            rsl[i++] = left[i++];
        }
        while (r < right.length) {
            rsl[i++] = right[r++];
        }
        return rsl;
        }


    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

