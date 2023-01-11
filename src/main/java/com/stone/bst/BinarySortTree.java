package com.stone.bst;

public class BinarySortTree {
    private Node root;
    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("BinarySortTree is empty");
            return;
        }
    }
}
