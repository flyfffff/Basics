package com.designPatterns.InterpreterPattern;

/***
 * @ClassName: InterpreterTest
 * @Description:  解释器模式 :  对一些有规则的、固定的文法进行通用解析
 * @Auther: sf
 * @Date: 2020/3/2511:04
 */
public class InterpreterTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.parse("10 + 30 / ( ( 6 - 4 ) * 2 - 2 )");
        System.out.println(calculator.getRestult());
        calculator.parse("10 + 30 / ( ( 20 - 3 * 4 + 2 ) - 4 ) * 2");
        System.out.println(calculator.getRestult());
    }

}
