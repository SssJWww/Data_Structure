package com.stone.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{101,34,119,1};
//        insertSortAsc(array);
        insertSortDesc(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSortAsc(int[] array) {
/*
        //逐步推导
        //定义待插入的数
        int insertValue = array[1];
        int insertIndex = 1-1;

        //给insertValue找到插入的位置
        //insertIndex >= 0 && insertValue < array[insertIndex] 代表待插入数，还没有找到适当的位置
        while (insertIndex >= 0 && insertValue < array[insertIndex]) {
            array[insertIndex+1] = array[insertIndex];
            insertIndex--;
        }

        //当退出while循环时则找到位置
        array[insertIndex+1] = insertValue;
        System.out.println("第一轮");

        insertValue = array[2];
        insertIndex = 2-1;

        while (insertIndex >= 0 && array[insertIndex] > insertValue) {
            array[insertIndex+1] = array[insertIndex];
            insertIndex--;
        }

        array[insertIndex+1] = insertValue;
*/

        for(int i=1; i<array.length; i++){
            int insertValue = array[i];
            int insertIndex = i-1;
            while (insertIndex >= 0 && array[insertIndex] > insertValue) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }

            if (insertIndex != i-1) {
                array[insertIndex+1] = insertValue;
            }
        }
    }

    public static void insertSortDesc(int[] array){
        for (int i=1; i<array.length; i++) {
            int insertValue = array[i];
            int insertIndex = i-1;
            while (insertIndex>=0 && array[insertIndex]<insertValue) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }

            array[insertIndex+1] = insertValue;
        }
    }
}
