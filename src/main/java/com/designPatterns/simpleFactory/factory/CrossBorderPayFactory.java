package com.designPatterns.simpleFactory.factory;


import com.designPatterns.simpleFactory.paytype.CrossBorderPay;

public abstract class CrossBorderPayFactory implements Payment {

    public static CrossBorderPay getInstance(CrossBorderPay crossBorderPay) {
        try {
            return crossBorderPay.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
