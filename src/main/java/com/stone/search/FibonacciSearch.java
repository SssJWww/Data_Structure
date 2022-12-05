package com.stone.search;

import java.util.Arrays;

public class FibonacciSearch {
    private static int MAXSIZE = 20;

    public static void main(String[] args) {
        int[] array = {1,8,10,89,1000,1234};
    }

    //因为使用mid = low + F(k-1)-1, 所以需要获取斐波那契数列
    public static int[] fib(){
        int[] f = new int[MAXSIZE];
        f[0] = 1;
        f[1] = 1;
        for (int i=2; i<MAXSIZE; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f;
    }

    //编写斐波那契查找算法
    public static void fibonacciSearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        int divideIndex = 0; //斐波那契分割值的下标
        int middle = 0; //存放mid值
        int[] f = fib();

        //获取斐波那契分割点的值
        while (high > f[divideIndex] -1) {
            divideIndex++;
        }

        //因为f[divideIndex]的值可能大于 原始数组array的长度 因此需要使用Arrays类 创建一个新数组 并代替原数组array
        int[] temp = Arrays.copyOf(array, f[divideIndex]);

        //当长度不够的时候需要将新数组中补0位置填充的0都换成原数组中最后一个值
        for (int i = high+1; i<temp.length; i++) {
            temp[i] = array[high];
        }

        //使用while循环处理，找到我们的数key
        while (low <= high) {
            middle = low + f[divideIndex-1] -1;

            if (divideIndex < temp[middle]) {
                high = middle-1;
                divideIndex--;
            }
        }
    }
}
