package com.stone.stack;

public class LinkedStack {
    private LinkedStackNode head = new LinkedStackNode(0);
    private LinkedStackNode cur = head;


    public void push(LinkedStackNode node){
        node.next = cur.next;
        node.pre = cur;
        cur.next = cur;
        cur = node;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("栈为空");
        }

        System.out.println(cur);
        cur.pre.next = cur.next;
        cur = cur.pre;
    }

    public boolean isEmpty(){
        return cur == head;
    }
}
