package com.stone;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] array = {4, 17, 6, 44, 31, 90, 55};

//        bubbleSort(array);
//        selectSort(array);
//        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort(int[] array) {
        int insertValue;
        int insertIndex;
        for (int d = array.length/2; d>0; d/=2) {
            for (int i=d; i< array.length; i++) {
                insertValue = array[i];
                insertIndex = i-d;

                while (insertIndex>=0 && array[insertIndex] > insertValue) {
                    array[insertIndex+d] = array[insertIndex];
                    insertIndex -= d;
                }

                array[insertIndex+d] = insertValue;
            }
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotPosition = pivotPosition(array, left, right);
            quickSort(array,left, pivotPosition-1);
            quickSort(array, pivotPosition+1, right);
        }
    }

    public static int pivotPosition(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int pivotValue = array[l];
        while (l < r) {
            while (l<r && array[r] >= pivotValue) r--;
            array[l] = array[r];

            while (l<r && array[l] <= pivotValue) l++;
            array[r] = array[l];
        }

        array[l] = pivotValue;
        return l;

    }

    public static void bubbleSort(int[] array) {
        int temp;
        boolean flag;
        for (int i=0; i< array.length-1; i++) {
            flag = false;
            for (int j=0; j< array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                return;
            }
        }
    }

    public static void selectSort(int[] array) {
        int minIndex;
        int minValue;
        for (int i=0; i< array.length-1; i++) {
            minValue = array[i];
            minIndex = i;
            for (int j = i+1; j< array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = minValue;
            }

        }
    }

    public static void insertSort(int[] array) {
        int insertValue;
        int insertIndex;
        for (int i=1; i< array.length; i++) {
            insertValue = array[i];
            insertIndex = i-1;
            while (insertIndex>=0 && array[insertIndex]>insertValue) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }
            array[insertIndex+1] = insertValue;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {  //0 1
            int middle = (left+right)/2; //0
            mergeSort(array,left, middle); //0 0
            mergeSort(array, middle+1, right);//1 1
            merge(array, left, middle, right); // array 0 0 1
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int l = left;  //0
        int r = middle+1; //1
        int index = 0;
        int[] temp = new int[array.length];

        while (l <=middle && r<=right) {
            if (array[l] <= array[r]) {
                temp[index++] = array[l++];
            } else {
                temp[index++] = array[r++];
            }
        }

        while (l<= middle) {
            temp[index++] = array[l++];
        }

        while (r <= right) {
            temp[index++] = array[r++];
        }

        index = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            array[tempLeft++] = temp[index++];
        }

    }
}
