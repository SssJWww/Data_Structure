package com.stone.queue;

public class ArrayCircleQueue {
    private int maxSize; //array max size
    private int front; //front point
    private int rear; //rear point
    private int[] array; //模拟队列
    private static int INITIAL_SIZE = 10;

    //创建队列初始化的构造器
    public ArrayCircleQueue(int arrayMaxSize) {
        this.maxSize = arrayMaxSize;  //如果maxSize为4，实际上数组只能存储3个数据 因为最后一个位置留下判定约束
        this.array = new int[this.maxSize];
        this.front = 0;
        this.rear = 0;
    }

    public ArrayCircleQueue() {
        this(INITIAL_SIZE);
    }

    //判断队列是否满
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    } // 有一个预留位置

    //判断队列是否为空
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    //添加数据到队列中
    public void add(int n) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        array[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    //获取队列数据
    public int getQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int value = array[front];
        front = (front + 1) % maxSize;
        return value;
    }

    //获取队列所有数据
    public void showQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }

        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, array[i % maxSize]);
        }
    }

    //显示队列头部数据
    public void showHead() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        System.out.println("头部数据为：" + array[front]);
    }

    //求出当前队列有效数据个数
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }
}
