package com.stone.tree;

public class TreeDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1,"1");
        Node node2 = new Node(2,"2");
        Node node3 = new Node(3,"3");
        Node node4 = new Node(4,"4");

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);

        BinaryTree binaryTree = new BinaryTree(node1);

        binaryTree.postOrder();


    }
}
