package com.stone.recursion;

import java.util.Arrays;

public class Queen8 {
    //一共多少个皇后
    int max = 8;
    int count = 0;
    //定义数组array，保存皇后放置位置的结果，比如 arr= {0, 4, 7, 5, 2, 6, 1, 3}
    int[] array = new int[max];

    public static void main(String[] args) {
//        int[] arr = new int[]{0, 4, 7, 5, 2, 6, 1, 3};

        //test
        Queen8 queen8 = new Queen8();
        queen8.put(0);
        System.out.println(queen8.count);
    }

    private void put(int n) {
        if(n == max) {
            print();
            return;
        }

        //一次放入皇后，并判断是否冲突
        for(int i=0; i<max; i++) {
            //先把当前皇后n，放到该行的第一列
            array[n] = i;
            //判断当放置第n个皇后到i列时，是否冲突
            if(!isConflict(n)) {
                //接着放n+1个皇后
                put(n+1);
            }
            //如果冲突，就继续执行array[n]=i;即将第n个皇后，放置在本行的后一列
        }
    }

    //查看当我们放置第n个皇后，就去检测该皇后是否和前面已经摆放的皇后冲突
    private boolean isConflict(int n) {
        for (int i=0; i<n; i++) {
            if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])) {
                return true;
            }
        }
        return false;
    }

    //写一个方法可以将皇后摆放的位置输出
    private void print() {
        System.out.println(Arrays.toString(array));
        count++;
    }
}
