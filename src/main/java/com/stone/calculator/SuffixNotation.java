package com.stone.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SuffixNotation {
    public static List<String> transferMiddleToSuffix(String expression){
        int index = 0;
        String scan;
        List<String> resultList = new ArrayList<>();
        Stack<String> operatorStack = new Stack<>();
        boolean flag;
        while (index < expression.length()) {
            flag = true;
            scan = expression.substring(index,index+1);
            while (flag) {
                if(isOperator(scan)) {
                    if(operatorStack.isEmpty() || scan.equals("(")
                        || operatorStack.peek().equals("(")
                        || compare(scan,operatorStack.peek()) > 0)
                    {
                        operatorStack.push(scan);
                        flag = false;
                    } else if(scan.equals(")")) {
                        while (!operatorStack.peek().equals("(")){
                            resultList.add(operatorStack.pop());
                        }
                        operatorStack.pop();
                        flag = false;
                    } else {
                        resultList.add(operatorStack.pop());
                        flag = true;
                    }
                } else if(scan.matches("\\d+")){
                    if (index == expression.length() -1) {
                        resultList.add(scan);
                        break;
                    }

                    String nextBit = expression.substring(index+1,index+2);
                    while (nextBit.matches("\\d+")) {
                        scan += nextBit;
                        index++;
                        nextBit = expression.substring(index+1,index+2);
                    }
                    resultList.add(scan);
                    flag = false;
                }
            }
            index++;
        }

        while (!operatorStack.isEmpty()) {
            resultList.add(operatorStack.pop());
        }

        return resultList;
    }

    public static boolean isOperator(String str){
        if(str == null){
            throw new RuntimeException("运算符有误");
        }

        return str.equals("+") || str.equals("-")
                || str.equals("*") || str.equals("/")
                || str.equals("(") || str.equals(")");
    }

    public static int compare(String scan, String top) {
        int num1;
        int num2;
        num1 = priority(scan);
        num2 = priority(top);
        return num1 - num2;
    }

    public static int priority(String str){
        if(str.equals("*") || str.equals("/")) {
            return 1;
        } else if(str.equals("+") || str.equals("-")) {
            return 0;
        }
        return 0;
    }
}
