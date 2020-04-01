package com.designPatterns.simpleFactory;

import com.designPatterns.simpleFactory.factory.CrossBorderPayFactory;
import com.designPatterns.simpleFactory.factory.InlandPayFactory;
import com.designPatterns.simpleFactory.impl.PayPalPay;
import com.designPatterns.simpleFactory.impl.wecatPay;
import com.designPatterns.simpleFactory.paytype.CrossBorderPay;

import java.util.Iterator;

/***
 * @ClassName: FactroyTest
 * @Description:  工厂模式，隐藏创建的细节，只提供创建的方法，用户无需关心内部细节
 *                  优点：创建对象只需要知道名称或者类型就可以了，无需知道复杂的创建过程。面向接口编程，用户无需知道细节，减少耦合度
 *                  缺点: 每当增加产品时，就会新增类，使得系统过于臃肿，增加了系统的复杂度
 *                  所以需要我们在设计的仔细思考取舍。
 * @Auther: sf
 * @Date: 2020/3/1120:51
 */
public class FactroyTest {
    public static void main(String[] args) {
        PayPalPay palPay =  (PayPalPay)CrossBorderPayFactory.getInstance(new PayPalPay());
        wecatPay wecatPay =  (wecatPay) InlandPayFactory.getInstance(new wecatPay());
        palPay.payTwo();
        wecatPay.payOne();

    }
}
