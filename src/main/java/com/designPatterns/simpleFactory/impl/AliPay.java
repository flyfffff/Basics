package com.designPatterns.simpleFactory.impl;

import com.designPatterns.simpleFactory.paytype.InlandPay;

/***
 * @ClassName: AliPay
 * @Description: 阿里支付
 * @Auther: sf
 * @Date: 2020/3/1120:53
 */
public class AliPay implements InlandPay {

    public void payOne() {
        System.out.printf("欢迎使用 阿里支付");
    }
}
