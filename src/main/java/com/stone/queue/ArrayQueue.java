package com.stone.queue;

public class ArrayQueue {
    private int maxSize; //array max size
    private int front; //front point
    private int rear; //rear point
    private int[] array; //模拟队列
    private static int INITIAL_SIZE = 10;

    //创建队列初始化的构造器
    public ArrayQueue(int arrayMaxSize){
        this.maxSize = arrayMaxSize;
        this.array = new int[this.maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public ArrayQueue() {
        this(INITIAL_SIZE);
    }

    //判断队列是否满
    public boolean isFull() {
        return this.rear == maxSize-1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    //添加数据到队列中
    public void add(int n) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        array[++rear] = n;
    }

    //获取队列数据
    public int getQueue(){
        //判断队列是否为空
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return array[++front];
    }

    //获取队列所有数据
    public void showQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        for(int i=0; i<array.length; i++){
            System.out.printf("arr[%d]=%d\n",i,array[i]);
        }
    }

    //显示队列头部数据
    public void showHead(){
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        System.out.println("头部数据为："+array[front+1]);
    }

}


