package com.stone;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] array = {4,17,6,44,31,90,55};
//        bubbleSortByAsc(array);
//        bubbleSortDesc(array);
//        selectSortAsc(array);
//        selectSortDesc(array);
//        insertSortAsc(array);
//        insertSortDesc(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSortByAsc(int[] array) {
        boolean flag = false;
        int temp;
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    public static void bubbleSortDesc(int[] array) {
        int temp;
        boolean flag = false;
        for (int i=0; i< array.length-1; i++) {
            for (int j=0; j<array.length-1; j++) {
                if(array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    public static void selectSortAsc(int[] array) {
        int min;
        int minIndex;
        for (int i=0; i<array.length-1; i++) {
            min = array[i];
            minIndex = i;
            for (int j=i+1; j< array.length;j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if(min != array[i]) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }

    public static void selectSortDesc(int[] array) {
        int max;
        int maxIndex;
        for (int i=0; i<array.length-1; i++) {
            max = array[i];
            maxIndex = i;
            for (int j=i+1; j<array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }

            if (max != array[i]) {
                array[maxIndex] = array[i];
                array[i] = max;
            }
        }
    }

    public static void insertSortAsc(int[] array) {
        int insertIndex;
        int insertValue;
        for (int i=1; i< array.length; i++) {
            insertValue = array[i];
            insertIndex = i-1;
            while (insertIndex>=0 && array[insertIndex] > insertValue ) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }
            array[insertIndex+1] = insertValue;
        }
    }

    public static void insertSortDesc(int[] array) { //{4,17,6,44,31,90,55};
        int insertValue;                             //{17,4,6,44,31,90,55}
        int insertIndex;                             //{17,6,4,44,31,90,55}
        for (int i=1; i< array.length; i++) {
            insertValue = array[i];
            insertIndex = i-1;
            while (insertIndex>=0 && array[insertIndex] < insertValue) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }

            array[insertIndex+1] = insertValue;
        }
    }
}
