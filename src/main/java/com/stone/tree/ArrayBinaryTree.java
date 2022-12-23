package com.stone.tree;

public class ArrayBinaryTree {
    private int[] array;

    public ArrayBinaryTree() {
    }

    public ArrayBinaryTree(int[] array) {
        this.array = array;
    }

    //编写一个方法，完成顺序存储二叉树的前序遍历

    /**
     *
     * @param index array index
     */
    public void preOrder(int index) {
        if (array.length ==0 || array == null) {
            System.out.println("array is null, can not order");
        }

        System.out.println(array[index]);
        if (2*index+1<array.length) {
            preOrder(2*index+1);
        }

        if (2*index+2 < array.length) {
            preOrder(2*index+2);
        }
    }

    public void infixOrder(int index) {
        if (array == null || array.length == 0) {
            System.out.println("array can not order");
        }

        if (2*index+1 < array.length) {
            infixOrder(2*index+1);
        }
        System.out.println(array[index]);

        if (2*index+2 < array.length) {
            infixOrder(2*index+2);
        }
    }

    public void postOrder(int index) {
        if (array == null || array.length == 0) {
            System.out.println("array can not order");
        }

        if (2*index+1 < array.length) {
            infixOrder(2*index+1);
        }

        if (2*index+2 < array.length) {
            infixOrder(2*index+2);
        }

        System.out.println(array[index]);
    }
}
