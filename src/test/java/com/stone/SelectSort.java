package com.stone;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{22,6,10,55,84,0,9};
        selectSortDesc(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSortAsc(int[] array){
        int min;
        int minIndex = 0;
        for (int i=0;i< array.length-1;i++) {
            min = array[i];
            for (int j = i+1; j< array.length; j++) {
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

    public static void selectSortDesc(int[] array) {
        int max;
        int maxIndex = 0;
        for(int i=0; i< array.length-1; i++) {
            max = array[i];
            for (int j = i+1; j< array.length; j++) {
                if (array[j]>max) {
                    maxIndex = j;
                    max = array[maxIndex];
                }
            }
            if (maxIndex != i){
                array[maxIndex] = array[i];
                array[i] = max;
            }
        }
    }
}
