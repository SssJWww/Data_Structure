package com.stone.queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出菜单
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出");
            System.out.println("a(add):队列增加数据");
            System.out.println("g(get):显示队列数据");
            System.out.println("h(head):显示队列头数据");
            key = scanner.next().charAt(0); //接收一个字符
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数字");
                    int value = scanner.nextInt();
                    arrayQueue.add(value);
                    break;
                case 'g':
                    try {
                        int result = arrayQueue.getQueue();
                        System.out.println("取出的数据是"+result);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 'h':
                    arrayQueue.showHead();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
            System.out.println("程序退出");
        }
    }
}
