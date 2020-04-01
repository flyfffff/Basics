package com.designPatterns.ObserverPattern;

import com.google.common.eventbus.Subscribe;

import java.util.Queue;

/***
 * @ClassName: Teacher
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/3019:11
 */
public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void update(Question question){
        System.out.println(this.name+"老师您好,"+question.getUserName()+"在Gper社区提交了一个问题:"+question.getContext()+",请及时回复。");
    }
}
