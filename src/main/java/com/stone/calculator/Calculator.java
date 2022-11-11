package com.stone.calculator;

import com.stone.stack.ArrayStack;

public class Calculator {
    public static void main(String[] args) {
        String expression = "300+22*6-4";
        ArrayStack numsStack = new ArrayStack(expression.length());
        ArrayStack operStack = new ArrayStack(expression.length());
        int index = 0; // 扫描索引
        int num1 = 0;
        int num2 = 0;
        int operator = 0;
        int result = 0;
        char ch = ' ';
        String keepNum = ""; //用于拼接多位数
        while(true) {
            //依次得到expression的每一个字符
            ch = expression.substring(index, index+1).charAt(0);

            if (operStack.isOperator(ch)) {
                if (operStack.isEmpty()
                    ||
                    operStack.priority(operStack.showTop())< operStack.priority(ch)
                   )
                {
                    operStack.push(ch);
                } else if(operStack.priority(operStack.showTop()) >= operStack.priority(ch)){
                    num1 = numsStack.pop();
                    num2 = numsStack.pop();
                    operator = operStack.pop();
                    result = numsStack.calculate(num1, num2, operator);
                    numsStack.push(result);
                    operStack.push(ch);
                }
            } else {
                //处理多位数
                keepNum += ch;
                if(index == expression.length()-1 || operStack.isOperator(expression.substring(index+1,index+2).charAt(0))){
                    numsStack.push(Integer.parseInt(keepNum));
                }else {
                    while (!operStack.isOperator(expression.substring(index+1,index+2).charAt(0))){
                        index++;
                        ch = expression.substring(index,index+1).charAt(0);
                        keepNum += ch;
                    }
                    numsStack.push(Integer.parseInt(keepNum));
                }
                keepNum = "";
            }
            index++;
            if (index == expression.length()){
                break;
            }
        }

        //当扫描结束，就顺序从数栈和符号栈中pop出相应的数和符号，并运行
        while (true) {
            if(numsStack.getTop() == 0){
                System.out.println("结果为："+numsStack.pop());
                break;
            }
            num1 = numsStack.pop();
            num2 = numsStack.pop();
            operator = operStack.pop();
            result = numsStack.calculate(num1,num2,operator);
            numsStack.push(result);
        }
    }
}
