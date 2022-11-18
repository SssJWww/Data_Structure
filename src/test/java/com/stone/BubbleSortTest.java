package com.stone;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] array = {5,1,64,22,90,71};
//        bubbleSortAsc(array);
        bubbleSortDesc(array);
        System.out.println(Arrays.toString(array));
    }


    public static void bubbleSortAsc(int[] array) {
        int temp;
        boolean flag = false;
        for (int i=0; i< array.length-1; i++) {
            for (int j=0; j< array.length-1-i; j++) {
                if(array[j]>array[j+1]) {
                    temp =array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }

    public static void bubbleSortDesc(int[] array) {
        boolean flag = false;
        int temp;
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j< array.length-1-i; j++) {
                if (array[j+1]>array[j]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = true;
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
