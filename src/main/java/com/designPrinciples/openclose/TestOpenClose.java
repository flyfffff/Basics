package com.designPrinciples.openclose;

/***
 * @ClassName: TestOpenClose
 * @Description:  开闭原则，对扩展开放，对修改关闭。在我们去维护原有的代码或者在原有的功能上新增一些东西 的时候，尽量做到不去修改原有的代码
 *             因为我们不知道修改的地方被多少地方所，引用。而是采用新增类的方式，而不改变原有的逻辑。
 * @Auther: sf
 * @Date: 2020/3/420:26
 */
public class TestOpenClose {
    public static void main(String[] args) {
        ICourse iCourse = new JavaCoure(875875,"数学",11280D);
        System.out.println(iCourse.toString());

        ICourse iCourse1 = new DiscontCoure(875875,"数学",11280D);
        DiscontCoure discontCoure = (DiscontCoure)iCourse1;
        System.out.printf("编号"+discontCoure.getId()+
                "\n课程"+discontCoure.getName()+"\n售价"+discontCoure.getDiscontPrice()
                +"\n原价"+discontCoure.getPrice()
        );

    }
}
