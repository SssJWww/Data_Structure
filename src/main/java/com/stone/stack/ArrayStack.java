package com.stone.stack;


public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public int getTop() {
        return top;
    }

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("栈以满");
            return;
        }
        stack[++top] = num;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的");
        }
        int value = stack[top--];
        return value;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int showTop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空");
        }
        return stack[top];
    }

    public void showStack() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    //返回运算符的优先级，优先级使用数字表示，数字越大 则优先级越高
    public int priority(int operator) {
        if (operator == '*' || operator == '/') {
            return 1;
        } else if (operator == '+' || operator == '-') {
            return 0;
        } else {
            return -1; //获取的操作符不正确
        }
    }

    //判断是不是运算符
    public boolean isOperator(char value) {
        return value == '+' || value == '-' || value == '*' || value == '/';
    }

    //计算方法
    public int calculate(int num1, int num2, int operator) {
        int result = 0; //用于存放结果
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 / num1;
                break;
            default:
                break;
        }
        return result;
    }

}
