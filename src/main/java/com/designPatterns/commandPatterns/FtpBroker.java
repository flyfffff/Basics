package com.designPatterns.commandPatterns;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: FtpBroker
 * @Description:
 * @Auther: sf
 * @Date: 2020/3/1815:36
 */
public class FtpBroker {
    private List<FtpCommand> list = new ArrayList<FtpCommand>();

    public void  takeFtp(FtpCommand ftpCommand) {
       list.add(ftpCommand);
    }
    public void placeFtpCommand(){
        for (FtpCommand ftpCommand: list) {
            ftpCommand.execute();
        }
    }

}
