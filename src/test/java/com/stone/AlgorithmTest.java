package com.stone;

public class AlgorithmTest {
    public static void main(String[] args) {
        int[] array = new int[]{3,6,1,3,9,7};
        sort(array);
        for(int num : array){
            System.out.println(num);
        }
    }

    public static void sort(int[] array){
        for (int i=1; i<array.length; i++){
            for (int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
