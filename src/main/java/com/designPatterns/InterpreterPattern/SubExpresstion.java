package com.designPatterns.InterpreterPattern;


/***
 * @ClassName: SubExpresstion
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2516:19
 */
public class SubExpresstion extends NotTerminaExpression{
    public SubExpresstion(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpreter() {
        return this.expressionA.interpreter() - this.expressionB.interpreter();
    }
}
