package com.stone;

import java.util.Arrays;

public class CombineArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] combine = combineArray(arr1, arr2);
        System.out.println(Arrays.toString(combine));
    }

    public static int[] combineArray(int[] arr1, int[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] array = new int[length1+length2];
        if (arr1.length ==0 || arr2.length == 0) {
            System.out.println("数组长度为0");
        }
        int pointA=0;
        int pointB=0;
        int index=0;
        while (pointA<length1 && pointB<length2) {
            if (arr1[pointA] <= arr2[pointB]) {
                array[index++] = arr1[pointA++];
            } else {
                array[index++] = arr2[pointB++];
            }
        }

        if (pointA == length1) {
            while (pointB < length2) {
                array[index++] = arr2[pointB++];
            }
        } else if (pointA == length2) {
            while (pointA < length1) {
                array[index++] = arr1[pointA++];
            }
        }
        return array;
    }
}
