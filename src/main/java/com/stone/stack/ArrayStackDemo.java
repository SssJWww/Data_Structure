package com.stone.stack;

public class ArrayStackDemo {
    public static void main(String[] args) {
        int size = 5;
        ArrayStack stack = new ArrayStack(size);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        stack.showStack();

        LinkedStack linkedStack = new LinkedStack();
        LinkedStackNode node1 = new LinkedStackNode(1);
        LinkedStackNode node2 = new LinkedStackNode(2);
        LinkedStackNode node3 = new LinkedStackNode(3);
        LinkedStackNode node4 = new LinkedStackNode(4);
        LinkedStackNode node5 = new LinkedStackNode(5);
        linkedStack.push(node1);
        linkedStack.push(node2);
        linkedStack.push(node3);
        linkedStack.push(node4);
        linkedStack.push(node5);
        while (!linkedStack.isEmpty()) {
            linkedStack.pop();
        }
    }
    
    
}
