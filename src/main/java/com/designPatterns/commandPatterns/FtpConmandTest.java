package com.designPatterns.commandPatterns;

/***
 * @ClassName: FtpConmandTest
 * @Description: 命令模式 ： 将请求封装成一个对象，从而能使不同的客户端进行调用
 * @Auther: sf
 * @Date: 2020/3/1815:35
 */
public class FtpConmandTest {
    public static void main(String[] args) {
        FtpRequest ftpRequest = new FtpRequest();
        FtpCommadGet ftpGet= new FtpCommadGet(ftpRequest);
        FtpCommadPut ftpPut= new FtpCommadPut(ftpRequest);
        FtpCommadMeget ftpMeget= new FtpCommadMeget(ftpRequest);
        FtpCommadMeput ftpMeput= new FtpCommadMeput(ftpRequest);

        FtpBroker ftpBroker = new FtpBroker();
        ftpBroker.takeFtp(ftpGet);
        ftpBroker.takeFtp(ftpPut);
        ftpBroker.takeFtp(ftpMeget);
        ftpBroker.takeFtp(ftpMeput);

        ftpBroker.placeFtpCommand();


    }
}
