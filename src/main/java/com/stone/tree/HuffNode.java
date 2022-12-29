package com.stone.tree;

public class HuffNode implements Comparable<HuffNode>{
    int value;
    HuffNode left;
    HuffNode right;

    public HuffNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HuffNode{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(HuffNode o) {
        //表示从小到大排序
        return this.value - o.value;
    }
}
