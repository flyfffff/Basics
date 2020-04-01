package com.designPatterns.simpleFactory.impl;

import com.designPatterns.simpleFactory.paytype.InlandPay;

/***
 * @ClassName: UniPay
 * @Description: 银联支付
 * @Auther: sf
 * @Date: 2020/3/1120:53
 */
public class UniPay implements InlandPay {
    public void payOne() {
        System.out.printf("欢迎使用银联支付！");
    }
}
