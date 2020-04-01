package com.designPatterns.mediatorPattern;

/***
 * @ClassName: ConcreteColleague1
 * @Description: 具体的同事类Two
 * @Auther: sf
 * @Date: 2020/3/2510:44
 */
public class ConcreteColleague2 extends Colleague{
    @Override
    void send() {
        System.out.println("ConcreteColleague2 send message .");
        this.mediator.replay(this);
    }

    @Override
    void recevie() {
        System.out.println("ConcreteColleague2 recevie message .");
    }
}
