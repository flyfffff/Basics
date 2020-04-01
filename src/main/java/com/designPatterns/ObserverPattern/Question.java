package com.designPatterns.ObserverPattern;

/***
 * @ClassName: Question
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/3019:07
 */
public class Question {
    private String userName;
    private String context;

    public Question(String userName, String context) {
        this.userName = userName;
        this.context = context;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
