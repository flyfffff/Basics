package com.designPatterns.statusPatterns;

/***
 * @ClassName: UserLoginStaus
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/2218:56
 */
public class UserLoginStaus extends User{
    public void favorite() {
        System.out.println("收藏成功");
    }

    public void comment(String comment) {
        System.out.println(comment);
    }
}
