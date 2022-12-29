package com.stone.tree;

public class Node{
    private int id;
    private String name;
    private Node left;
    private Node right;

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
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

    public void postOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }

        if (this.right != null) {
            this.right.infixOrder();
        }

        System.out.println(this);
    }

    public void preSearch(int id) {
        if (this.id == id) {
            System.out.println("查找到了节点，节点为" + this);
            return;
        }

        if (this.left != null) {
            this.left.preSearch(id);
        }

        if (this.right != null) {
            this.right.preSearch(id);
        }
    }

    public Node infixSearch(int id) {
        Node res = null;
        if (this.left != null) {
           res = this.left.infixSearch(id);
        }

        if (res != null) return res;

        if (this.id == id) {
            return this;
        }

        if (this.right != null) {
            res = this.right.infixSearch(id);
        }

        if (res != null) return res;

        return null;
    }

    public void postSearch(int id) {
        if (this.left != null) {
            this.left.preSearch(id);
        }

        if (this.right != null) {
            this.right.preSearch(id);
        }

        if (this.id == id) {
            System.out.println("查找到了节点，节点为" + this);
            return;
        }
    }

}
