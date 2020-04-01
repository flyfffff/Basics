package com.designPatterns.commandPatterns;

/***
 * @ClassName: FtpRequest
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/1812:08
 */
public class FtpRequest {
    //下载
    public void get(){
        System.out.println("========执行下载操作=======");
    }
    //批量下载
    public void meget(){
        System.out.println("=======执行批量下载操作======");
    }
    //上传
    public void put(){
        System.out.println("=======执行下载操作========");
    }
    //批量上传
    public void meput(){
        System.out.println("=======执行批量上传操作======");
    }

}
