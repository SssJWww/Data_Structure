package com.stone.bst;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    //add node
    public void add(Node node) {
        if (node == null) {
            return;
        }

        //verify value between current and node
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }

        System.out.println(this);

        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
