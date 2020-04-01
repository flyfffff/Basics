package com.designPatterns.InterpreterPattern;

/***
 * @ClassName: AddExpresstion
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2516:19
 */
public class AddExpresstion  extends NotTerminaExpression{

    public AddExpresstion(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpreter() {
        return this.expressionA.interpreter() + this.expressionB.interpreter();
    }
}
