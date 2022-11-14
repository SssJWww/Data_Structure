package com.stone.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args) {
        //(30+4)*5-6 => 30 4 + 5 * 6 -
        String middleExpression = "(30+4)*5-6";
        String suffixExpression = SuffixNotation.transferMiddleToSuffix(middleExpression);
        System.out.println(suffixExpression);

        //1.将suffixExpression放入ArrayList中
        List<String> list = transferExpressToList(suffixExpression);
        System.out.println(list);

        //2。将ArrayList 传递给一个方法 配合栈完成计算
        int result = calculateSuffixExpression(list);
        System.out.println(result);
    }

    public static List<String> transferExpressToList(String expression){
        String[] split = expression.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String item:split){
            list.add(item);
        }
        return list;
    }

    public static int calculateSuffixExpression(List<String> list){
        Stack<String> stack = new Stack<>();

        for (String item : list){
            if(item.matches("\\d+")){
                stack.push(item);
            } else {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if(item.equals("+")) {
                    res = num1 + num2;
                } else if(item.equals("-")) {
                    res = num1 - num2;
                } else if(item.equals("*")) {
                    res = num1 * num2;
                } else if(item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有错误");
                }
                stack.push(String.valueOf(res));
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
