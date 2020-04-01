package com.designPrinciples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * @ClassName: test
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/1118:55
 */
public class test {
    public static void main(String[] args) {
        printf(1);
    }
    static Map map = new HashMap<String,Object>();
    static List<Integer> list = new ArrayList();
    static{
        map.put(1,"setFebruary");//添加修改月份对应的方法
        list.add(1);//月份
    }
    public static void printf(int getMonth){
        List<Integer> monthLists = list.subList(getMonth,list.size());
        for (Integer month : monthLists) {
            map.get(month);//拿到方法 反射调用
        }
    }
    public static void setFebruary(){

    }
}
