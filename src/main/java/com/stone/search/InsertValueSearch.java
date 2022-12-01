package com.stone.search;

public class InsertValueSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int result = insertValueSearch(array, 1, 0, array.length - 1);
        System.out.println(result);
    }

    public static int insertValueSearch(int[] array, int target, int left, int right) {
        if(left > right || target < array[left] || target > array[right]) return -1;

        int middle = left + (right-left)*(target-array[left])/(array[right]-array[left]);

        if (target > array[middle]) {
            return insertValueSearch(array, target, middle+1,right);
        } else if (target < array[middle]) {
            return insertValueSearch(array, target, left, middle-1);
        } else {
            return middle;
        }
    }
}
