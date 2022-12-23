package com.stone.tree;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("根结点为空");
        }
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("根结点为空");
        }
    }

    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("根结点为空");
        }
    }

    public void preSearch(int id) {
        if (this.root != null) {
            this.root.preSearch(id);
        } else {
            System.out.println("根结点为空");
        }
    }

    public Node infixSearch(int id) {
        if (this.root != null) {
            return this.root.infixSearch(id);
        } else {
            System.out.println("根结点为空");
            return null;
        }
    }

    public void postSearch(int id) {
        if (this.root != null) {
            this.root.postSearch(id);
        } else {
            System.out.println("根结点为空");
        }
    }

}
