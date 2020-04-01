package com.designPatterns.InterpreterPattern;



import java.lang.reflect.Method;
import java.util.*;

/***
 * @ClassName: Calculator
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2515:57
 */
public class Calculator {


    private Stack<Integer> expressionStack = new Stack<>();
    private Stack<String> expressionStack2 = new Stack<>();
    private static int leftBracketsIndex ; //记录左括号位置

    public  void parse(String expression) {
        String [] expressionStrs = expression.split(" ");
        Stack<String> bracketsStack = new Stack<>();
        //遍历，遇到（括号截取交给 doBracketsOperator，返回一个处理过括号的字符串，再放到栈中处理
        for (int i = 0; i < expressionStrs.length; i++) {
            if("(".equals(expressionStrs[i])){
                List<String> expressionList = Arrays.asList(expressionStrs);
                bracketsStack.push(doBracketsOperator(expressionList.subList(i+1,expressionStrs.length)));
                i += leftBracketsIndex;
            }else{
                bracketsStack.push(expressionStrs[i]);
            }
        }
        doAddOperator(bracketsStack);
    }

    //括号运算
    public String doBracketsOperator(List<String> expressionList){
        Stack<String> inBracketsStack = new Stack<>();
        for (int i = 0; i < expressionList.size(); i++) {
          //遇到括号，递归
         if("(".equals(expressionList.get(i))){
                inBracketsStack.push(doBracketsOperator(expressionList.subList(expressionList.indexOf("(")+1,expressionList.size())));
                i += leftBracketsIndex; //记录右括号位置
            }else if(")".equals(expressionList.get(i))){
                //遇到左括号直接运算
                doAddOperator(inBracketsStack);
                leftBracketsIndex = i +1; //处理游标位置
                return (String.valueOf(getRestult()));
            }else{
                inBracketsStack.push(expressionList.get(i));
            }
        }
            return inBracketsStack.toArray(new String [inBracketsStack.size()]).toString();
    }

    //运算
    public void doAddOperator(Stack<String> stack){

        String [] operator =  stack.toArray(new String [stack.size()]);
        expressionStack.clear();
            if(stack.contains("*") || stack.contains("/")){
              operator=  doMulAndDivOperator(operator);
           }
            for (int i = 0; i < operator.length; i++) {
                if(isOperator(operator[i])){
                    int calculatorAfter = doExpression(operator[i],new TerminaExpression(expressionStack.pop()),new TerminaExpression(Integer.valueOf(String.valueOf(operator[++i]))));
                    expressionStack.push(calculatorAfter);
                }else{
                    expressionStack.push(Integer.valueOf(String.valueOf(operator[i])));
                }
            }

        }
     //乘除运算
    public String[] doMulAndDivOperator(String[] operator){
        expressionStack2.clear();
        for (int i = 0; i < operator.length; i++) {
            if(isOperatorMulAndDiv(operator[i])){
                int calculatorAfter = doExpression(operator[i],new TerminaExpression(Integer.valueOf(expressionStack2.pop())),new TerminaExpression(Integer.valueOf(operator[++i])));
                expressionStack2.push(String.valueOf(calculatorAfter));
            }else{
                expressionStack2.push(String.valueOf(operator[i]));
            }
        }
        return expressionStack2.toArray(new  String [expressionStack.size()]);
    }
    public  int getRestult(){
        return expressionStack.pop();
    }
    private  boolean isOperator(String parameter){
        if("+".equals(parameter) || "-".equals(parameter) || "*".equals(parameter) || "/".equals(parameter)){
            return true;
        }
       return false;
    }

    private  boolean isOperatorMulAndDiv(String parameter){
        if("*".equals(parameter) || "/".equals(parameter)){
            return true;
        }
        return false;
    }
    private int doExpression(String operator,Expression expressionA , Expression expressionB){
        if("+".equals(operator)){
           return new AddExpresstion(expressionA,expressionB).interpreter();
        }else if("-".equals(operator)){
            return new SubExpresstion(expressionA,expressionB).interpreter();
        }else if("*".equals(operator)){
            return new MulExpresstion(expressionA,expressionB).interpreter();
        }else if("/".equals(operator)){
            return new DivExpresstion(expressionA,expressionB).interpreter();
        }else{
            return 0;
        }

    }
}
