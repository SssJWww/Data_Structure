package com.stone;

import java.util.Arrays;

public class ShellSortTest {
    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,3,5,4,6,0};
//        shellSortAsc(array);
        shellSortDesc(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSortAsc(int[] array) {
        int insertValue;
        int insertIndex;
        for (int d= array.length/2; d>0; d/=2) {
            for (int i=d; i< array.length; i++) {
                insertIndex = i;
                insertValue = array[i];
                if(array[insertIndex] < array[insertIndex-d]) {
                    while (insertIndex-d>=0 && insertValue < array[insertIndex-d]) {
                        array[insertIndex] = array[insertIndex-d];
                        insertIndex -=d;
                    }
                    array[insertIndex] = insertValue;
                }
            }
        }
    }

    public static void shellSortDesc(int[] array) {
        int insertValue;
        int insertIndex;
        for (int d=array.length/2; d>0; d/=2) {
            for (int i=d; i< array.length; i++) {
                insertIndex = i;
                insertValue = array[i];
                if (array[insertIndex] > array[insertIndex-d]) {
                    while (insertIndex-d>=0 && insertValue > array[insertIndex-d]) {
                        array[insertIndex] = array[insertIndex-d];
                        insertIndex -= d;
                    }
                    array[insertIndex] = insertValue;
                }
            }
        }
    }
}
