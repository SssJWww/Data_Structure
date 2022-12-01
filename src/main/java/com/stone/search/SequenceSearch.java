package com.stone.search;

public class SequenceSearch {
    public static void main(String[] args) {
        int[] array = {1,-1,7,4,10,99,67};
        int result = seqSearch(array, 11);
        System.out.println(result);
    }

    public static int seqSearch(int[] array, int target) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
