package com.designPatterns.InterpreterPattern;

/***
 * @ClassName: MulExpresstion
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2516:18
 */
public class MulExpresstion extends NotTerminaExpression{

    public MulExpresstion(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpreter() {
        return this.expressionA.interpreter() * this.expressionB.interpreter();
    }
}
