package com.stone.doubleLinkedList;

public class DoubleNode {
    public int id;
    public String name;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode() {
    }

    public DoubleNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
