package com.stone.hashtable;

import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(7);

        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add：添加");
            System.out.println("list：遍历");
            System.out.println("search:查找");
            System.out.println("exit: 推出");
            key = scanner.next();

            switch (key) {
                case "add":
                    System.out.println("id");
                    int id = scanner.nextInt();
                    System.out.println("name");
                    String name = scanner.next();
                    Employee emp = new Employee(id, name);
                    hashTable.add(emp);
                    break;

                case "list":
                    hashTable.list();
                    break;

                case "search":
                    System.out.println("search_id");
                    int search_id = scanner.nextInt();
                    hashTable.search(search_id);
                    break;

                case "delete":
                    System.out.println("delete_id");
                    int delete_id = scanner.nextInt();
                    hashTable.delete(delete_id);
                    break;

                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
