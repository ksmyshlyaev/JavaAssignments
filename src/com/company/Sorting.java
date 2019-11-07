package com.company;

import java.util.Arrays;

public class Sorting {

    private static int[] arraySorting(int[] array){
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 100, -10, 0, -4};
        System.out.println(Arrays.toString(Sorting.arraySorting(a)));
    }
}
