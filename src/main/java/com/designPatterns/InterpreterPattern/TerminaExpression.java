package com.designPatterns.InterpreterPattern;

/***
 * @ClassName: TerminaExpression
 * @Description: 终结表达式
 * @Auther: sf
 * @Date: 2020/3/2513:59
 */
public class TerminaExpression implements Expression{

    int number;

    public TerminaExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpreter() {
        return number;
    }
}
