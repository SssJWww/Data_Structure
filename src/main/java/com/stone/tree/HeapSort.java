package com.stone.tree;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,5,9};
        int[] results = heapSort(arr);
        System.out.println(Arrays.toString(results));
    }

    //write a heapSort method
    public static int[] heapSort(int[] array) {
        int temp;
        //first step adjust Max heap
        for (int i=array.length/2-1;i>=0;i--) {
            adjustHeap(array,i,array.length);
        }

        //adjust heap swap first index and finally index value and then adjust heap
        for (int j= array.length-1; j>0; j--) {
            temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            adjustHeap(array,0,j);
        }
        return array;
    }

    /**
     * make array(tree) adjust to a maxHeap
     * @param array current array
     * @param i index of non leaf node
     * @param length the number of adjusting node
     */
    public static void adjustHeap(int[] array, int i, int length) {
        //save non leaf node value into variable temp
        int temp = array[i];

        for (int k=i*2+1; k<length; k = k*2+1) {
            if(k+1 < length && array[k] < array[k+1] ) {
                k++;
            }

            if (array[k] > temp) {
                array[i] = array[k];
                i = k;
            } else {
                break;
            }
        }

        array[i] = temp;
    }
}
