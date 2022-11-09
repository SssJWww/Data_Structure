package com.stone.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1,"1","1");
        Node node2 = new Node(2,"2","2");
        Node node3 = new Node(3,"3","3");
        Node node4 = new Node(4,"4","4");
        Node node5 = new Node(5,"5","5");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(node1);
        singleLinkedList.addByOrder(node2);
        singleLinkedList.addByOrder(node5);
        singleLinkedList.addByOrder(node4);
        singleLinkedList.addByOrder(node3);
//        singleLinkedList.deleteNode(node3);
        singleLinkedList.showList();
    }
}
