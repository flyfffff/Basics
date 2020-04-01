package com.designPrinciples.dependencyInversion;

/***
 * @ClassName: StudyPythonCourse
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/623:15
 */
public class StudyPythonCourse implements StudyCourse{
    public void study() {
        System.out.printf("学习Python课程");
    }
}
