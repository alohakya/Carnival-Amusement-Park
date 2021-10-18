package strategy;

import state.*;
import ticket.Ticket;
import constant.Const;

/**
 * 买票接口的实现类，实现买票功能
 *
 * @function 购买学生票
 * @pattern 策略模式(Strategy)
 * @author Yejingxin
 * */

public class StudentTicket  implements TicketStrategy{
    /**
     *买票函数，实现了买票的功能
     */
    @Override
    public void buyTicket(){
        System.out.println("======== 使用策略 Strategy 模式 ========");
        System.out.println("接口名：TicketStrategy");
        System.out.println("模式：Strategy");
        System.out.println("方法名：TicketStrategy.buyTicket()");
        System.out.println("功能描述：采用不同的策略购票");
        System.out.println("======================================");
        System.out.println("您选择了购买学生票，成人票票价：120rmb");
        Ticket ticket=new Ticket();
        ticket.setType(Const.STUDENT_TICKET);
        ticket.setPrice(Const.STUDENT_TICKET_MONEY);
        ticket.buy();
        ticket.getTicket();//显示购票信息
        System.out.println("欢迎您的下次光临！");
    }
}
