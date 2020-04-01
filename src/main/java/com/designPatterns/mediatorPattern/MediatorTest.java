package com.designPatterns.mediatorPattern;

/***
 * @ClassName: MediatorTest
 * @Description:  中介者模式 , 用来降低类与类之间通讯的复杂度，提供一个中介类，处理类与类之间的通信，降低了类与类之间的耦合度。
 *
 * @Auther: sf
 * @Date: 2020/3/2510:46
 */
public class MediatorTest {
    public static void main(String[] args) {
         ConcreteMediator concreteMediator = new ConcreteMediator();
         Colleague colleagueOne = new ConcreteColleague1();
        Colleague colleagueTwo = new ConcreteColleague2();
        Colleague colleagueThree = new ConcreteColleague3();
        concreteMediator.regitster(colleagueOne);
        concreteMediator.regitster(colleagueTwo);
        concreteMediator.regitster(colleagueThree);

        colleagueOne.send();
        colleagueTwo.send();
        colleagueThree.send();

    }
}
