package com.stone.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8,4,5,7,1,3,6,2};
        mergeSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        int middle;
        if (left < right) {
            middle = (left + right)/2;
            //向左递归进行分解
            mergeSort(array,left,middle);
            mergeSort(array,middle+1,right);
            merge(array,left,middle,right);  //left:0 middle:0 right:1
        }
    }

    /**
     * @param array initial array
     * @param left left first index
     * @param middle middle index
     * @param right right index
     */
    public static void merge(int[] array, int left, int middle, int right) {
        int[] temp = new int[array.length];
        int l = left; // initial left
        int r = middle+1; // initial right
        int index = 0; // array temp index

        //归并两个分组
        while (l<=middle && r<=right) {
            if (array[l] <= array[r]) {
                temp[index++] = array[l++];
            } else {
                temp[index++] = array[r++];
            }
        }

        //将左侧和右侧剩余的放入数组中
        while (r<=right) {
            temp[index++] = array[r++];
        }

        while (l<=middle) {
            temp[index++] = array[l++];
        }

        /*
            将temp数组的元素拷贝到array中
        */
        index=0;
        int tempLeft = left;
        while (tempLeft <= right) {
            array[tempLeft++] = temp[index++];
        }

    }

}
