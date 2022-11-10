package com.stone.doubleLinkedList;

public class DoubleLinkedList {
    private DoubleNode head = new DoubleNode(0,"head");

    public DoubleNode getHead() {
        return head;
    }

    //遍历双向链表
    public void showList(){
        if(isEmpty()){
            System.out.println("链表为空");
        }
        DoubleNode cur = head.next;
        while (cur!=null){
            System.out.println(cur);
            cur = cur.next;
        }
    }

    //判断是否为空
    public boolean isEmpty(){
        return head.next == null;
    }

    //添加节点
    public void addNode(DoubleNode node){
        DoubleNode temp = head;
        while (true) {
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    //添加节点按照顺序
    public void addByOrder(DoubleNode node){
        DoubleNode cur = head;
        boolean flag = false;

        while (true) {
            if(cur.next == null) {
                flag = true;
                break;
            }
            if(cur.next.id > node.id){
                flag = true;
                break;
            }
            if (cur.next.id == node.id) {
                flag = false;
                break;
            }
            cur = cur.next;
        }
        if(flag){
            node.next = cur.next;
            cur.next = node;
            node.pre = cur;
        } else {
            System.out.println("您要添加的节点"+node.id+"已经存在不能添加");
        }
    }

    //修改节点
    public void updateNode(DoubleNode node){
        if(isEmpty()){
            System.out.println("链表为空");
        }

        DoubleNode temp = head.next;
        boolean isExist = false;
        while (true) {
            if (temp == null) {
                break;
            }

            if (temp.id == node.id) {
                isExist = true;
                break;
            }
            temp = temp.next;
        }

        if(isExist){
            temp.name = node.name;
        } else {
            System.out.println("没有找到相应节点");
        }
    }

    //删除节点
    public void deleteNode(int id){
        if (isEmpty()) {
            System.out.println("链表为空");
        }
        DoubleNode temp = head.next;
        boolean isExist = false;
        while (true) {
            if (temp == null){
                break;
            }
            if (temp.id == id) {
                isExist = true;
                break;
            }
            temp = temp.next;
        }

        if(isExist){
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("没有找到相应节点");
        }
    }
}
