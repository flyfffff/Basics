package com.designPatterns.ObserverPattern;

import com.google.common.eventbus.Subscribe;

/***
 * @ClassName: Gper
 * @Description:  社区类
 * @Auther: sf
 * @Date: 2020/3/3018:57
 */
public class Gper {
    private String name = "咕泡生态圈";
    private static Gper gper = new Gper();

    private Gper(){

    }
    public static  Gper getInstance(){
        return gper;
    }


    public  void publishQuestion(Question question){
        System.out.println("在"+name+"上,"+question.getUserName()+"发布了一个问题:"+question.getContext());
    }
}
