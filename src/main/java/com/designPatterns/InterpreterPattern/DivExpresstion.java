package com.designPatterns.InterpreterPattern;

/***
 * @ClassName: DivExpresstion
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2516:19
 */
public class DivExpresstion extends NotTerminaExpression {
    public DivExpresstion(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpreter() {
        return this.expressionA.interpreter() / this.expressionB.interpreter();
    }
}
