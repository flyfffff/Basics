package com.designPrinciples.openclose;

/***
 * @ClassName: DiscontCoure
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/420:29
 */
public class DiscontCoure extends JavaCoure{
    public DiscontCoure(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscontPrice() {
        return super.getPrice()*0.8;
    }
}
