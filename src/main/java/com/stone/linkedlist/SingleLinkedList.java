package com.stone.linkedlist;

public class SingleLinkedList {
    //初始化头节点，头节点不要动 不存储数据
    private Node head = new Node(0,"head","head");

    //添加节点到单向链表中
    public void add(Node node){
        //因为头节点不能动，需要用变量借接住head 进行遍历
        Node temp = head;
        while(true) {
            //找到最后
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addByOrder(Node node){
        Node temp = head;
        boolean isExist = false; //添加的标号是否存在 默认为false
        while (true) {
            if(temp.next == null) {
                break;
            }
            if(temp.next.id > node.id) {
                break;
            }
            if(temp.next.id == node.id) {
                isExist = true;
                break;
            }
            temp = temp.next;
        }

        if(isExist) {
            System.out.println("准备添加的节点已经存在");
        } else {
            //插入到链表中
            node.next = temp.next;
            temp.next = node;
        }
    }

    //删除节点
    public void deleteNode(Node node){
        if (isEmpty()){
            System.out.println("链表为空");
            return;
        }

        Node beforeTemp = head;
        Node temp = head.next;

        while (true){
            if(temp.equals(node)) {
                beforeTemp.next = node.next;
                break;
            }
            beforeTemp = temp;
            temp = temp.next;
        }
    }

    //显示链表
    public void showList(){
        if(isEmpty()){
            System.out.println("链表为空");
            return;
        }

        Node temp = head.next;
        while (true) {
            System.out.println(temp);
            temp = temp.next;
            if(temp == null) {
                break;
            }
        }
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return head.next == null;
    }
}
