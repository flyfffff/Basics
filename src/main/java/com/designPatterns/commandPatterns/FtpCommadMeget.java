package com.designPatterns.commandPatterns;

/***
 * @ClassName: FtpCommadPu
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/1815:33
 */
public class FtpCommadMeget implements FtpCommand{
    FtpRequest ftpRequest;
    public FtpCommadMeget(FtpRequest ftpRequest) {
        this.ftpRequest = ftpRequest;
    }

    public void execute() {
        ftpRequest.meget();
    }
}
