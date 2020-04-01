package com.designPatterns.InterpreterPattern;

/***
 * @ClassName: NotTerminaExpression
 * @Description: 非终结表达式
 * @Auther: sf
 * @Date: 2020/3/2514:00
 */
public abstract class NotTerminaExpression implements Expression{

    protected Expression expressionA;
    protected Expression expressionB;

    public NotTerminaExpression(Expression expressionA, Expression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }

}
