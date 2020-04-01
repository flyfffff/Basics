package com.designPatterns.IteratorPatterns;

public interface CourseAggredate {
    public void add(Course course);
    public void remove(Course course);
    Iterator<Course> iterator();
}
