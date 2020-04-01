package com.designPatterns.IteratorPatterns;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: CourseAggredateImpl
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/170:20
 */
public class CourseAggredateImpl implements CourseAggredate{
    private List<Course> courseList;

    public CourseAggredateImpl() {
        this.courseList = new ArrayList();
    }

    public void add(Course course) {
        courseList.add(course);
    }

    public void remove(Course course) {
        courseList.remove(course);
    }

    public Iterator<Course> iterator() {

        return new IteratorImpl<Course>(courseList);
    }
}
