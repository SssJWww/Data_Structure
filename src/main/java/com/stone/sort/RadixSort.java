package com.stone.sort;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {53, 3, 542, 748, 14, 214};
    }

    public static void radixSort(int[] array) {
        //定义一个二维数组表示桶
        int[][] bucket = new int[10][array.length];

        //为了记录每个桶中，实际存放了多少个数据，我们定义一个一维数组来记录各个桶的每次放入的数据个数
        int[] bucketElementCounts = new int[10];

        for (int j = 0; j < array.length; j++) {
            //取出每个元素的个位数
            int digitOfElement = array[j] % 10;
            //放入到对应的桶中
            bucket[digitOfElement][bucketElementCounts[digitOfElement]++] = array[j];
        }

        int index = 0;
        for (int k = 0; k < bucket.length; k++) {
            if (bucketElementCounts[k] != 0) {
                for (int l = 0; l < bucketElementCounts[k]; l++) {
                    array[index] = bucketElementCounts[l];
                }
            }
        }


    }
}
