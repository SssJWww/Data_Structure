package com.stone.sort;

import java.util.Arrays;

public class BubbleSort {
    //冒泡排序的时间复杂的为O(n^2)
    public static void main(String[] args) {
        int[] arr = new int[]{3,9,-1,10,-2};
        int temp = 0;
/*
        //为了容易理解，展示冒泡排序的过程
        //step 1
        for(int j=0; j< arr.length-1;j++) {
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        //step 2
        for(int j=0; j< arr.length-1-1;j++) {
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        //step 3
        for(int j=0; j< arr.length-1-1-1;j++) {
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        //step 4
        for(int j=0; j< arr.length-1-1-1-1;j++) {
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
*/

        //最终步骤
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j< arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"次排序");
            System.out.println(Arrays.toString(arr));
        }

/*    将最小的冒泡到最前方
       for(int i=0;i< arr.length-1;i++) {
            for(int j= arr.length-1;j>=1+i;j--){
                if(arr[j-1]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/

    }


}
