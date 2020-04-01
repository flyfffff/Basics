package com.designPatterns.IteratorPatterns;

/***
 * @ClassName: IteratorTest
 * @Description:  迭代器模式 : 提供顺序访问对象各个元素，又不暴露对象内部表示。
 *                  使用场景 : 1、访问一个聚合对象的内容而无须暴露它的内部表示。
 *                  2、需要为聚合对象提供多种遍历方式。
 *                  3、为遍历不同的聚合结构提供一个统一的接口。
 * @Auther: sf
 * @Date: 2020/3/170:32
 */
public class IteratorTest {
    public static void main(String[] args) {
        Course javaCourse = new Course("java课程");
        Course PytnonCourse = new Course("Python课程");
        Course Ccourse = new Course("C语言课程");
        CourseAggredateImpl courseAggredate =new CourseAggredateImpl();
        courseAggredate.add(javaCourse);
        courseAggredate.add(PytnonCourse);
        courseAggredate.add(Ccourse);

        Iterator<Course> courseIterator = courseAggredate.iterator();
        System.out.printf("===========添加课程========\n");
        while (courseIterator.hashNext()){
            Course course = courseIterator.next();
            System.out.println("课程名称"+course.getName());

        }
        System.out.printf("===========删除课程之后========\n");
        courseAggredate.remove(PytnonCourse);
        Iterator<Course> removeIterator = courseAggredate.iterator();
        while (removeIterator.hashNext()){
            Course course = removeIterator.next();
            System.out.println("课程名称"+course.getName());
        }
    }
}
