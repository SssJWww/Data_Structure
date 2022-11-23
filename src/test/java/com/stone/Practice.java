package com.stone;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] array = {4, 17, 6, 44, 31, 90, 55};
//        bubbleSort(array);
//        selectSort(array);
//        insertSort(array);
//        shellSort(array);
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }

    public static void selectSort(int[] array) {
        int min;
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (min != array[i]) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }

    public static void insertSort(int[] array) {
        int insertIndex;
        int insertValue;
        for (int i = 1; i < array.length; i++) {
            insertValue = array[i];
            insertIndex = i - 1;

            while (insertIndex >= 0 && array[insertIndex] > insertValue) {
                array[insertIndex + 1] = array[insertIndex];
                insertIndex--;
            }

            array[insertIndex + 1] = insertValue;
        }
    }

    public static void shellSort(int[] array) {
        int insertIndex;
        int insertValue;
        for (int d = array.length / 2; d > 0; d /= 2) {
            for (int i = d; i < array.length; i++) {
                insertIndex = i - d;
                insertValue = array[i];
                while (insertIndex >= 0 && array[insertIndex] > insertValue) {
                    array[insertIndex + d] = array[insertIndex];
                    insertIndex -= d;
                }
                array[insertIndex + d] = insertValue;
            }
        }
    }

    public static void quickSort(int[] array,int left, int right){
        if (left<right) {
            int pivotPos = pivotPosition(array,left,right);
            quickSort(array,left,pivotPos-1);
            quickSort(array,pivotPos+1,right);
        }
    }

    public static int pivotPosition(int[] array, int left, int right){
        int pivot = array[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (l<r && array[r]>=pivot) r--;
            array[l] = array[r];
            while (l<r && array[l]<=pivot) l++;
            array[r] = array[l];
        }

        array[l] = pivot;
        return l;
    }
}
