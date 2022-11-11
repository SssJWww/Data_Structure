package com.stone.circleLinkedList;

public class CircleLinkedListDemo {
    public static void main(String[] args) {
        CircledLinkedList circledLinkedList = new CircledLinkedList();
        CircleNode node7 = new CircleNode(7);
        CircleNode node8 = new CircleNode(8);
        circledLinkedList.init(125);
//        circledLinkedList.addNode(node7);
//        circledLinkedList.addNode(node8);
//        circledLinkedList.showList();
        circledLinkedList.popByNum(10,20);
    }
}
