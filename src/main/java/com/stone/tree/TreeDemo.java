package com.stone.tree;

public class TreeDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1,"1");
        Node node2 = new Node(2,"2");
        Node node3 = new Node(3,"3");
        Node node4 = new Node(4,"4");
        Node node5 = new Node(5,"5");

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setLeft(node5);
        node3.setRight(node4);


        BinaryTree binaryTree = new BinaryTree(node1);

//        binaryTree.postOrder();

        Node res = binaryTree.infixSearch(5);


        int[] arr = new int[]{1,2,3,4,5,6,7};

        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
//        arrayBinaryTree.preOrder(0);
        arrayBinaryTree.infixOrder(0);
    }
}
