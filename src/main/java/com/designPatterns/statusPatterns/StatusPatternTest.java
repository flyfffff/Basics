package com.designPatterns.statusPatterns;

/***
 * @ClassName: StatusPatternTest
 * @Description:  状态模式   解决多个状态判断问题 , 其状态的改变在其内部实现，与用户无关。
 *                  对象的行为依赖它的状态，而随着状态的改变需要改变它的行为
 * @Auther: sf
 * @Date: 2020/3/2217:55
 */
public class StatusPatternTest {

    public static void main(String[] args) {
        AppContext appContext = new AppContext();
        appContext.favorite();
        appContext.comment("写得好，360个赞");
    }
}
