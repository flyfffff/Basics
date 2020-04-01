package com.designPatterns.simpleFactory.factory;

import com.designPatterns.simpleFactory.paytype.CrossBorderPay;
import com.designPatterns.simpleFactory.paytype.InlandPay;

public interface Payment {
    InlandPay getInlandPay(InlandPay inlandPay);
    CrossBorderPay getCrossBorderPay(CrossBorderPay crossBorderPay);
}
