package com.designPatterns.IteratorPatterns;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: IteratorImpl
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/170:02
 */
public class IteratorImpl<E> implements Iterator<E> {
    private List<E> list = new ArrayList<E>();
    private int corsor;

    public IteratorImpl(List<E> element) {
       list.addAll(element);
    }

    public E next() {
        System.out.printf("当前位置"+corsor);

        return list.get(corsor++);
    }

    public boolean hashNext() {
        if(corsor < list.size()){
            return true;

        }
        return false;
    }
}
