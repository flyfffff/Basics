package com.designPrinciples.dependencyInversion;

/***
 * @ClassName: StudyJavaCourse
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/623:15
 */
public class StudyJavaCourse implements StudyCourse{
    public void study() {
        System.out.printf("学习Java课程");
    }
}
