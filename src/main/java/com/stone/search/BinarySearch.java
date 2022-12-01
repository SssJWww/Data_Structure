package com.stone.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,6,7,8,9};
        int result = binarySearch(array, 10, 0, array.length - 1);
        System.out.println(result);
        List list = updateBinarySearch(array, 6, 0, array.length - 1);
        System.out.println(list);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right)/2;
        if (array[middle] == target) {
            return middle;
        } else if (target > array[middle]) {
            return binarySearch(array, target, middle+1,right);
        } else if (target < array[middle]) {
            return binarySearch(array, target, left, middle-1);
        }
        return -1;
    }

    public static List updateBinarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return new ArrayList<>();
        }
        int temp;
        int middle = (left+right)/2;
        ArrayList<Integer> list = new ArrayList<>();

        if (target > array[middle]) {
            return updateBinarySearch(array,target,middle+1, right);
        } else if (target < array[middle]) {
            return updateBinarySearch(array, target, left, middle-1);
        } else {
            list.add(middle);
            temp = middle - 1;
            while (true) {
                if (temp<0 || array[temp]!=target) {
                    break;
                }
                list.add(temp);
                temp--;
            }

            temp = middle+1;
            while (true) {
                if (temp>array.length-1 || array[temp] != target) {
                    break;
                }
                list.add(temp);
                temp++;
            }

            return list;
        }
    }
}
