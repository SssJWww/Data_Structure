package com.stone.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1,"1","1");
        Node node2 = new Node(2,"2","2");
        Node node3 = new Node(3,"3","3");
        Node node4 = new Node(4,"4","4");
        Node node5 = new Node(5,"5","5");
        Node node6 = new Node(6,"6","6");


        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        singleLinkedList1.addByOrder(node1);
        singleLinkedList1.addByOrder(node2);
        singleLinkedList1.addByOrder(node6);
        singleLinkedList2.addByOrder(node5);
        singleLinkedList2.addByOrder(node4);
        singleLinkedList2.addByOrder(node3);
        node5.name = "五";

        combineOrderedLinkedList(singleLinkedList1.getHead(),singleLinkedList2.getHead());
/*        singleLinkedList.updateNode(node6);
        singleLinkedList.deleteNode(node1);
        singleLinkedList.showList();
        int count = singleLinkedList.count();
        System.out.println(count);
        singleLinkedList.searchByReverseOrder(3);
        singleLinkedList.reverse2();
        System.out.println("反转后的链表～～～～～～～～～～～～～～～～～");
        singleLinkedList.showList();
        System.out.println("逆序打印～～～～～～～～～～～～～～～～～");
        singleLinkedList.reversePrint();*/
    }

    //合并两个有序链表 使生成后的仍为有序链表
    public static void combineOrderedLinkedList (Node formerHead, Node latterHead){
        Node former = formerHead.next;
        Node latter = latterHead.next;
        Node newHead = new Node(0,"head","head");
        Node temp = newHead;


        while (true){
            if(former == null){
                temp.next = latter;
                break;
            }

            if (latter == null){
                temp.next = former;
                break;
            }

            if (former.id < latter.id){
                temp.next = former;
                former = former.next;
                temp = temp.next;
            } else {
                temp.next = latter;
                latter = latter.next;
                temp = temp.next;
            }
        }

        temp = newHead;
        while (temp.next != null){
            System.out.println(temp.next);
            temp = temp.next;
        }

    }
}
