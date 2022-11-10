package com.stone.doubleLinkedList;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleNode node1 = new DoubleNode(1,"1");
        DoubleNode node2 = new DoubleNode(2,"2");
        DoubleNode node3 = new DoubleNode(3,"3");
        DoubleNode node4 = new DoubleNode(4,"4");
        DoubleNode node5 = new DoubleNode(5,"5");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addByOrder(node1);
        doubleLinkedList.addByOrder(node5);
        doubleLinkedList.addByOrder(node2);
        doubleLinkedList.addByOrder(node4);
        doubleLinkedList.addByOrder(node4);

//        node4.name = "四";
//        doubleLinkedList.updateNode(node4);

//        doubleLinkedList.deleteNode(5);
        doubleLinkedList.showList();

    }
}
