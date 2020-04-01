package com.designPatterns.mediatorPattern;

/***
 * @ClassName: Mediator
 * @Description: 中介者的抽象
 * @Auther: sf
 * @Date: 2020/3/259:27
 */
public interface Mediator {

    //1、注册
    void regitster(Colleague colleagues);

    //2、调用，给同事类发送消息

    void replay(Colleague colleague);
}
