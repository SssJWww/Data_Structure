package com.stone;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{3,7,10,44,-2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        int temp;
        for (int i=0; i< arr.length-1; i++) {
            for (int j=0; j< arr.length-1-i; j++) {
                if(arr[j+1]<arr[j]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
