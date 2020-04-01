package com.designPatterns.mementoPattern;

/***
 * @ClassName: Memento
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2216:17
 */
public class Memento {
    String name;
    String context;
    String date;

    public Memento(String name, String context, String date) {
        this.name = name;
        this.context = context;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getContext() {
        return context;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", context='" + context + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
