package com.stone.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {-9,78,0,23,-567,70};
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array,int left, int right) {
        if (left < right){
            int pivotPosition = pivotPosition(array,left,right);
            quickSort(array,left,pivotPosition-1);
            quickSort(array,pivotPosition+1, right);
        }
    }

    public static int pivotPosition(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int pivot = array[l];

        //将数组中比pivot小的方法pivot左边，比pivot大的放到pivot右边
        while (l<r) {
            while (l<r && array[r]>=pivot) r--;
            array[l] = array[r];
            while (l<r && array[l]<=pivot) l++;
            array[r] = array[l];
        }
        array[l] = pivot;
        return l;
    }

}
