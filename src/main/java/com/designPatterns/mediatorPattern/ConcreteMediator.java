package com.designPatterns.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: ConcreteMediator
 * @Description: 具体的中介者
 * @Auther: sf
 * @Date: 2020/3/259:33
 */
public class ConcreteMediator implements Mediator{

    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void regitster(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleague.setMediator(this);
            this.colleagues.add(colleague);
        }

    }


    public void replay(Colleague colleague) {
      colleagues.forEach(c ->{
          if(! c.equals(colleague)){
              c.recevie();
          }
      });
    }
}
