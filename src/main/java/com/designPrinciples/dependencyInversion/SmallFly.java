package com.designPrinciples.dependencyInversion;

/***
 * @ClassName: SmallFly
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/623:19
 */
public class SmallFly {
    private StudyCourse iCourse;
    //构造注入
    public SmallFly(StudyCourse iCourse) {
        this.iCourse = iCourse;
    }
    public SmallFly( ) {

    }


    public  void  study(){
        iCourse.study();
    }
    //方法注入
    public  void  study(StudyCourse course){
                course.study();
    }


    public void setiCourse(StudyCourse iCourse) {
        this.iCourse = iCourse;
    }

}
