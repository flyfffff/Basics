package com.designPatterns.mementoPattern;

import java.util.Stack;

/***
 * @ClassName: EditWindows
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2216:14
 */
public class EditWindows {
    private Memento memento;
    public Stack<Memento> mementoss = new Stack<Memento>();

    public void saveData(Memento memento){
        mementoss.push(memento);
    }

    public Stack<Memento> unDoData(){
        mementoss.pop();
        return mementoss;
    }

}
