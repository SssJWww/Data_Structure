package com.stone.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1,"1","1");
        Node node2 = new Node(2,"2","2");
        Node node3 = new Node(3,"3","3");
        Node node4 = new Node(4,"4","4");
        Node node5 = new Node(5,"5","5");
        Node node6 = new Node(6,"6","6");


        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(node1);
        singleLinkedList.addByOrder(node2);
        singleLinkedList.addByOrder(node5);
        singleLinkedList.addByOrder(node4);
        singleLinkedList.addByOrder(node3);
        node5.name = "五";

//        singleLinkedList.updateNode(node6);
//        singleLinkedList.deleteNode(node1);
        singleLinkedList.showList();
//        int count = singleLinkedList.count();
//        System.out.println(count);
//        singleLinkedList.searchByReverseOrder(3);
        singleLinkedList.reverse2();
        System.out.println("反转后的链表～～～～～～～～～～～～～～～～～");
        singleLinkedList.showList();
    }
}
