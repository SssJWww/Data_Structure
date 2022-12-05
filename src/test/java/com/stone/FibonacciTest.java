package com.stone;

public class FibonacciTest {
    public static void main(String[] args) {
        int result = fber(4);
        System.out.println(result);
    }

    public static int fber(int num) {
        if (num==1) return 1;
        if (num==2) return 2;
        return fber(num-1) + fber(num-2);
    }
}
