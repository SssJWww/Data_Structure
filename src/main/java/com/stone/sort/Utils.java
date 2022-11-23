package com.stone.sort;

public class Utils {
    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i=0; i<length; i++){
            array[i] = (int) (Math.random()*length);
        }
        return array;
    }
}
