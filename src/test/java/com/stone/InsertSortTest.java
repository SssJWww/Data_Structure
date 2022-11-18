package com.stone;

import java.util.Arrays;

public class InsertSortTest {
    public static void main(String[] args) {
        int[] array = new int[]{22,6,10,55,84,0,9};
//        insertSortAsc(array);
        insertSortDesc(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSortAsc(int[] array){
        int insertValue;
        int insertIndex;
        for (int i=1; i< array.length; i++) {
            insertValue = array[i];
            insertIndex = i-1;
            while (insertIndex>=0 && array[insertIndex]>insertValue) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }

            if (insertIndex != i-1) {
                array[insertIndex+1] = insertValue;
            }
        }
    }

    public static void insertSortDesc(int[] array){
        int insertValue;
        int insertIndex;
        for (int i=1; i<array.length; i++) {
            insertValue = array[i];
            insertIndex = i-1;
            while (insertIndex>=0 && array[insertIndex]<insertValue) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }
            if (insertIndex != i-1) {
                array[insertIndex+1] = insertValue;
            }
        }

    }
}
