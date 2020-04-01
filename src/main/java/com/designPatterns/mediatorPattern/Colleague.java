package com.designPatterns.mediatorPattern;

/***
 * @ClassName: Colleague
 * @Description:  同事类
 * @Auther: sf
 * @Date: 2020/3/259:26
 */
public abstract class Colleague {
    protected Mediator mediator;

    //发送消息
    abstract void send();

    //接受消息
    abstract void recevie();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
