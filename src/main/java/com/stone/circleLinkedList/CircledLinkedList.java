package com.stone.circleLinkedList;

public class CircledLinkedList {
    //创建一个first节点,但是没有数值
    private CircleNode first = null;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //初始化环形链表
    public void init(int num){
        if (num<1){
            System.out.println("num is invalid");
            return;
        }

        setSize(num);

        CircleNode cur = null;
        //use for circulation to create circledList
        for(int i=1; i<=num; i++){
            //根据编号创建节点
            CircleNode node = new CircleNode(i);
            //节点加入链中，id=1特殊处理
            if(i == 1) {
                first = node;
                first.setNext(first);
                cur = first;
            } else {
                cur.setNext(node);
                node.setNext(first);
                cur = node;
            }

        }
    }

    //添加节点
    public void addNode(CircleNode node){
        if(first == null){
            System.out.println("请初始化");
        }
        CircleNode cur = first;
        while (true) {
            if (cur.getNext() == first){
                break;
            }
            cur = cur.getNext();
        }

        cur.setNext(node);
        node.setNext(first);
    }

    //遍历链表
    public void showList(){
        if (first == null) {
            System.out.println("列表为空");
        }

        CircleNode cur = first;
        while (true) {
            System.out.println(cur);
            if (cur.getNext() == first){break;}
            cur = cur.getNext();
        }
    }

    //josephus约瑟夫出圈问题
    public void popByNum(int startNum, int num){
        if (first == null || startNum <1 || startNum > getSize()) {
            System.out.println("列表为空");
        }
        CircleNode startPoint = first;
        while (startNum-1>0){
            startPoint = startPoint.getNext();
            startNum--;
        }
        CircleNode helper = first;
        while (true) {
            if (helper.getNext() == startPoint){
                break;
            }
            helper = helper.getNext();
        }
        pop(num,startPoint,helper);
    }

    public void pop(int num,CircleNode startPoint, CircleNode helper){
        if (helper == startPoint) {
            System.out.println(startPoint);
            return;
        }

        int count = num;
        while (count-1>0){
            startPoint = startPoint.getNext();
            helper = helper.getNext();
            count--;
        }

        System.out.println(startPoint);
        startPoint = startPoint.getNext();
        helper.setNext(startPoint);

        pop(num,startPoint,helper);
    }
}
