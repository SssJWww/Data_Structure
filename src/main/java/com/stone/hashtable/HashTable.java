package com.stone.hashtable;

public class HashTable {
    private EmpLinkedList[] array;
    private int size;

    public HashTable(int size) {
        this.size = size;
        //仅仅初始化了数组，没有初始化数组中的链表
        array = new EmpLinkedList[size];
        //初始化数组中的链表
        for (int i=0; i<size; i++) {
            array[i] = new EmpLinkedList();
        }
    }

    public void add(Employee emp) {
        //get relevant index place by emp id
        int index = hash(emp.id);
        array[index].add(emp);
    }

    public void list() {
        for (int i=0; i<size; i++) {
            array[i].list(i+1);
        }
    }

    public boolean search(int id) {
        int index = hash(id);
        Employee result = array[index].search(id);
        if (result != null) {
            System.out.println(result);
            return true;
        } else {
            System.out.println("在HashTable中没有找到该Emp");
            return false;
        }
    }

    public void delete(int id) {
        if (search(id)) {
            int index = hash(id);
            array[index].delete(id);
        } else {
            System.out.println("在HashTable中没有找到该Emp");
        }
    }

    public int hash(int id) {
        return id % size;
    }
}
