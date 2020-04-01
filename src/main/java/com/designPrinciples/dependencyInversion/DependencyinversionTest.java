package com.designPrinciples.dependencyInversion;

/***
 * @ClassName: Dependencyinversion
 * @Description: 依赖倒置原则  针对接口编程，实现应该依赖抽象，抽象不应该依赖实现。
 * @Auther: sf
 * @Date: 2020/3/623:10
 */
public class DependencyinversionTest {
    public static void main(String[] args) {
        //如果要新学习课程，只需要新增对应的课程类，然后在顶层应用层修改代码即可
        //v1 方法注入
       SmallFly smallFly = new SmallFly();
       smallFly.study(new StudyAiCourse());
       smallFly.study(new StudyJavaCourse());
        smallFly.study(new StudyPythonCourse());

        //v2 构造注入
        SmallFly smallFly1 = new SmallFly(new StudyAiCourse());
        SmallFly smallFly2 = new SmallFly(new StudyJavaCourse());
        SmallFly smallFly3 = new SmallFly(new StudyPythonCourse());
        smallFly1.study();
        smallFly2.study();
        smallFly3.study();

        //v3 set注入
        SmallFly smallFly4 = new SmallFly();
        smallFly4.setiCourse(new StudyJavaCourse());
        smallFly4.study();
    }
}
