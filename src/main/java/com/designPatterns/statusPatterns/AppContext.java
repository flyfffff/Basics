package com.designPatterns.statusPatterns;

/***
 * @ClassName: AppContext
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2218:51
 */
public class AppContext {
    public static final  User USER_UNLOGIN = new UserUnLoginStaus();
    public static final  User USER_LOGIN = new UserLoginStaus();



    private User currentUser = USER_UNLOGIN;

    {
        USER_UNLOGIN.setAppContext(this);
        USER_LOGIN.setAppContext(this);
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getUser() {
        return currentUser;
    }

    public  void favorite(){
        this.currentUser.favorite();
    };//收藏

    public  void comment(String comment){
        this.currentUser.comment(comment);
    };//评论
}
