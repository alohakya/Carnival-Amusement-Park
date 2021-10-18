import state.*;
import ticket.Ticket;

import org.junit.jupiter.api.Test;

/**
 * 测试状态模式
 * 四种游客购票状态：未买票/已退票/已购买，未检票/检票成功，进入园区
 *
 * */
public class StateTest {
    @Test
    public void test(){
        Ticket a=new Ticket();
        a.printTicketState();
        a.buy();
        a.printTicketState();
        a.check();
        a.printTicketState();
        a.refund();
        a.printTicketState();
    }
}
