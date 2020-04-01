package com.designPatterns.statusPatterns;

/***
 * @ClassName: Status
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2218:50
 */
public abstract class User {
    protected AppContext appContext;
    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void favorite();//收藏

    public abstract void comment(String comment);//评论


}
