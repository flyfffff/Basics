package com.designPrinciples.openclose;

/***
 * @ClassName: JavaCoure
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/420:19
 */
public class JavaCoure implements ICourse {
    private Integer id ;
    private String name;
    private Double price;

    public JavaCoure(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "id"+id+"-----名字"+name+"----价格"+price;
    }
}
