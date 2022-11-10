package com.stone.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class SingleLinkedList {

    //初始化头节点，头节点不要动 不存储数据
    private Node head = new Node(0,"head","head");

    public Node getHead() {
        return head;
    }

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
        boolean isExist = false;

        while (true){
            if(temp == null) {break;} //遍历结束
            if(temp.id == node.id) {
                isExist = true;
                break;
            }
            beforeTemp = temp;
            temp = temp.next;
        }

        if(isExist) {
            beforeTemp.next = temp.next;
        }
    }

    //修改节点
    public void updateNode(Node node) {
        if (isEmpty()){
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        int nodeId = node.id;
        boolean isExist = false;

        while (true){
            if (temp == null) {break;} //遍历结束
            if(temp.id == nodeId) {
                isExist = true;
                break;
            }
            temp = temp.next;
        }

        if(isExist) {
            temp.name = node.name;
            temp.nickName = node.nickName;
            System.out.println("修改完成");
        } else {
            System.out.println("要修改的节点不存在");
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

    /**
     * 单链表面试题
     */
    //1.求但链表中节点个数
    public int count(){
        if (isEmpty()) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (true) {
            if(temp.next == null){
                break;
            }
            temp = temp.next;
            count++;
        }
        return count;
    }

    //查找倒数第k个节点
    public void searchByReverseOrder(int order){
        if(order>count() || order < 1){
            System.out.println("链表长度小于查找节点数，故没有");
        }
        if (isEmpty()) {
            System.out.println("链表为空");
        }
        Node temp = head;
        for (int i=0;i<count()-order+1;i++) {
            temp = temp.next;
        }

        System.out.println("查找节点为"+temp);
    }

    //单链表的反转
    public void reverse(){
        if (isEmpty()) {
            System.out.println("链表为空");
        }

        ArrayList<Node> list = new ArrayList<>();
        Node temp = head.next;
        while (true) {
            if (temp == null){break;}
            list.add(temp);
            temp = temp.next;
        }
        temp = head;
        for (int i=list.size()-1;i>=0;i--){
            temp.next = list.get(i);
            temp = temp.next;
        }
        temp.next = null;
    }

    public void reverse2(){
        if (isEmpty() || count()==1) {
            System.out.println("无法处理");
        }

        Node reverseHead = new Node();
        Node cur = head.next;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }

    //逆序打印
    public void reversePrint(){
        if (isEmpty()) {
            System.out.println("链表为空");
        }

        Stack<Node> stack = new Stack<>();
        Node temp = head.next;
        while (temp != null){
            stack.add(temp);
            temp = temp.next;
        }

        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
