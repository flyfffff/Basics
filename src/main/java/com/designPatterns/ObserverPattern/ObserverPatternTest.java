package com.designPatterns.ObserverPattern;

import com.google.common.eventbus.EventBus;

/***
 * @ClassName: ObserverPatternTest
 * @Description:  观察者模式 （发布-订阅模式）   当一个被观察者被修改时，会自动通知所有的观察者对象
 * @Auther: sf
 * @Date: 2020/3/3018:55
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Gper gper = Gper.getInstance();
        Question question1 =  new Question("张三","观察者模式的定义是什么？");
        Question question2 = new Question("李四","观察者模式的使用场景有哪些？");
        gper.publishQuestion(question1);
        gper.publishQuestion(question2);

        Teacher tom = new Teacher("Tom");
        Teacher jack = new Teacher("Jack");
        eventBus.register(tom);
        eventBus.register(jack);

        eventBus.post(question1);
        eventBus.post(question2);
    }
}
