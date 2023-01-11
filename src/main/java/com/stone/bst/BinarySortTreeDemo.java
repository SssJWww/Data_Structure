package com.stone.bst;

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        int[] array = {7,3,10,12,5,1,9};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i=0; i< array.length; i++) {
            binarySortTree.add(new Node(array[i]));
        }

        binarySortTree.infixOrder();
    }
}
