package com.designPrinciples.dependencyInversion;

/***
 * @ClassName: StudyAiCourse
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/623:15
 */
public class StudyAiCourse implements StudyCourse{

    public void study() {
        System.out.printf("学习Ai课程");
    }
}
