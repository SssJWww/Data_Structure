package com.stone.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] arr = {13,7,8,3,29,6,1};
        HuffNode node = createHuffmanTree(arr);
    }

    public static HuffNode createHuffmanTree(int[] array) {
        //first step In order to operate easily
        //traverse array
        //change every element from array into HuffNode
        //let HuffNode put into ArrayList
        List<HuffNode> nodes = new ArrayList<>();
        for (int value : array) {
            nodes.add(new HuffNode(value));
        }

        while (nodes.size()>1) {
            Collections.sort(nodes);

            HuffNode leftNode = nodes.get(0);
            HuffNode rightNode = nodes.get(1);

            HuffNode parent = new HuffNode(leftNode.value+rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;

            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(parent);
            Collections.sort(nodes);
        }

        return nodes.get(0);
    }
}
