package com.stone.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{3,67,12,90,23,44,15,19};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        int min;
        int minIndex = 0;
        for (int i=0; i< array.length-1; i++) {
            min = array[i];
            for (int j=i+1; j<array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
