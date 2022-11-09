package com.stone.linkedlist;

import java.util.Objects;

public class Node {
    public int id;
    public String name;
    public String nickName;
    public Node next;

    public Node() {
    }

    public Node(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    //为了显示方便重写toString
    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return id == node.id || Objects.equals(name, node.name) || Objects.equals(nickName, node.nickName);
    }

}
