package com.stone.circleLinkedList;

public class CircleNode {
    private int id;
    private CircleNode next;

    public CircleNode() {
    }

    public CircleNode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CircleNode getNext() {
        return next;
    }

    public void setNext(CircleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "CircleNode{" +
                "id=" + id +
                '}';
    }
}
