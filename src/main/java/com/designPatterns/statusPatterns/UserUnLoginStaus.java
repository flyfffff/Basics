package com.designPatterns.statusPatterns;

/***
 * @ClassName: UserUnLoginStaus
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2218:56
 */
public class UserUnLoginStaus extends User {
    public void favorite() {
        login();
        this.appContext.getUser().favorite();
    }

    public void comment(String comment) {
        login();
        this.appContext.getUser().comment(comment);
    }
    private void login() {
        System.out.println("跳转登录页");
        this.appContext.setCurrentUser(this.appContext.USER_LOGIN);
    }
}
