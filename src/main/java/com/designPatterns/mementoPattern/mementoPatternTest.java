package com.designPatterns.mementoPattern;

/***
 * @ClassName: mementoPattern
 * @Description:   备忘录模式 : 保存对象的一个状态，在合适的时候恢复对象
 *                     实现一个栈，把快照存放在栈中，来实现备忘录功能
 *                     存档、撤销等
 * @Auther: sf
 * @Date: 2020/3/2015:57
 */
public class mementoPatternTest {
    public static void main(String[] args) {
        EditWindows editWindows = new EditWindows();
        Memento memento = new Memento("sf","第一次修改保存内容","2020-03-22 16:27 000");
        editWindows.saveData(memento);
        Memento memento2 = new Memento("sf","第二次修改保存内容","2020-03-22 16:28 000");
        editWindows.saveData(memento2);
        Memento memento3 = new Memento("sf","第三次修改保存内容","2020-03-22 16:29 000");
        editWindows.saveData(memento3);
        System.out.println(editWindows.mementoss);

        editWindows.unDoData();
        System.out.println("恢复一次之后-----------");
        System.out.println(editWindows.mementoss);

        editWindows.unDoData();
        System.out.println("恢复二次之后-----------");
        System.out.println(editWindows.mementoss);

    }


}
