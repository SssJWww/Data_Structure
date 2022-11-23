package com.stone.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,3,5,4,6,0};
//        deduction(array);
//        shellSortAscByExchange(array);
        shellSortAsc(array);
        System.out.println(Arrays.toString(array));
    }

    public static void deduction(int[] array) {
        //shell sort round 1
        int temp;
        for(int i=5; i<array.length; i++) {
            for (int j = i-5; j>=0; j-=5) {
                if (array[j] > array[j+5]) {
                    temp = array[j];
                    array[j] = array[j+5];
                    array[j+5] = temp;
                }
            }
        }

        for (int i = 5/2; i<array.length; i++) {
            for (int j = i-2; j>=0; j-=2) {
                if (array[j] > array[j+2]) {
                    temp = array[j];
                    array[j] = array[j+2];
                    array[j+2] = temp;
                }
            }
        }

        for (int i = 2/2; i<array.length; i++) {
            for (int j = i-(2/2); j>=0; j-=(2/2)) {
                if (array[j]>array[j+(2/2)]) {
                    temp = array[j];
                    array[j] = array[j+(2/2)];
                    array[j+(2/2)] = temp;
                }
            }
        }

    }

    public static void shellSortAscByExchange(int[] array) {
        int temp;
        for (int d=array.length/2; d>0; d/=2) {
            for (int i=d; i< array.length; i++) {
                for(int j=i-d; j>=0; j-=d) {
                    if (array[j] > array[j+d]) {
                        temp = array[j];
                        array[j] = array[j+d];
                        array[j+d] = temp;
                    }
                }
            }
        }
    }

    public static void shellSortAsc(int[] array) { //移位法
        int insertIndex;
        int insertValue;
        for (int d= array.length/2; d>0; d/=2) {
            for (int i=d; i< array.length; i++) {
                insertValue = array[i];
                insertIndex = i;
                if(array[insertIndex] < array[insertIndex-d]) {
                    while (insertIndex-d>=0 && insertValue < array[insertIndex-d]) {
                        array[insertIndex] = array[insertIndex-d];
                        insertIndex -= d;
                    }

                    array[insertIndex] = insertValue;
                }
            }
        }

    }
}
