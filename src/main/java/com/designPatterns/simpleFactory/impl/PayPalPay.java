package com.designPatterns.simpleFactory.impl;

import com.designPatterns.simpleFactory.paytype.CrossBorderPay;

/***
 * @ClassName: PayPalPay
 * @Description: 跨境 PayPal支付
 * @Auther: sf
 * @Date: 2020/3/1121:00
 */
public class PayPalPay implements CrossBorderPay {
    public void payTwo() {
        System.out.printf("欢迎使用 PayPal 支付");
    }
}
