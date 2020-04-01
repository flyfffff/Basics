package com.designPatterns.simpleFactory.impl;

import com.designPatterns.simpleFactory.paytype.InlandPay;

/***
 * @ClassName: wecatPay
 * @Description: 微信支付
 * @Auther: sf
 * @Date: 2020/3/1120:53
 */
public class wecatPay implements InlandPay {
    public void payOne() {
        System.out.printf("欢迎使用微信支付！");
    }
}
