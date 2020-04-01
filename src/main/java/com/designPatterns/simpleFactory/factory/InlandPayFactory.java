package com.designPatterns.simpleFactory.factory;

import com.designPatterns.simpleFactory.paytype.InlandPay;

/***
 * @ClassName: InlandPayFactory
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/1120:47
 */
public abstract class InlandPayFactory implements Payment{

    public static InlandPay getInstance(InlandPay inlandPay){
        try {
            return inlandPay.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
