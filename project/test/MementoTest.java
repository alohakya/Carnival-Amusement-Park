import memento.CareTaker;
import org.junit.jupiter.api.Test;
import ticket.Ticket;

/**
 * 测试备忘录模式
 * 打印游客购票状态变更信息
 *
 * */

public class MementoTest {
    @Test
    public void test(){
        Ticket a=new Ticket();
        CareTaker caretaker = new CareTaker();
        caretaker.add(a.saveMemento());
        a.buy();
        caretaker.add(a.saveMemento());
        a.check();
        caretaker.add(a.saveMemento());
        a.refund();
        caretaker.add(a.saveMemento());
        caretaker.getAllTicketState();
    }
}
