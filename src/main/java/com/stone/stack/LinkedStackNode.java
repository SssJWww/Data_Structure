package com.stone.stack;

public class LinkedStackNode {
    public int id;
    public LinkedStackNode next;
    public LinkedStackNode pre;

    public LinkedStackNode() {
    }

    public LinkedStackNode(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LinkedStackNode{" +
                "id=" + id +
                '}';
    }
}
