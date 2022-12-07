package com.stone.hashtable;

public class EmpLinkedList {
    private Employee head;

    public void add(Employee emp) {
        //if add is first
        if (head == null) {
            head = emp;
            return;
        }

        Employee curEmp = head;
        Employee prev = null;
        while (true) {
            if (prev == null && emp.id < curEmp.id) {
                head = emp;
                emp.next = curEmp;
                break;
            }

            if (curEmp.id > emp.id) {
                prev.next = emp;
                emp.next = curEmp;
                break;
            }

            prev = curEmp;
            curEmp = curEmp.next;
        }

    }

    public void list(int num) {
        if (head == null) {
            System.out.println("list"+num+" is null");
            return;
        }

        Employee curEmp = head;
        while (true) {
            System.out.println(curEmp);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
    }

    public Employee search(int id) {
        if (head == null ) {
            System.out.println("链表为空");
            return null;
        }

        Employee curEmp = head;
        while (true) {
            if (curEmp.id == id) {
                break;
            }
            if (curEmp.next == null) {
                return null;
            }

            curEmp = curEmp.next;
        }

        return curEmp;
    }

    public void delete(int id) {
        Employee curEmp = head;
        Employee prev = null;
        while (true) {
            if (curEmp.id == id) {
                if (prev == null) {
                    head = curEmp.next;
                } else {
                    prev.next = curEmp.next;
                }
                return;
            }
            prev = curEmp;
            curEmp = curEmp.next;
        }
    }
}
