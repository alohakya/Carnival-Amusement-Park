package memento;

import state.TicketState;

import java.time.LocalDateTime;

/**
 * 购票状态备忘录
 *
 * @function 记录当前状态
 * @pattern Memento
 * @author Yejinxin
 **/

public class Memento {
    /***
     * 票的一些基本信息
     */
    //票的状态
    TicketState ticketState;

    //记录票各个状态的时间
    LocalDateTime dateTime;

    /**
     * 构造函数
     * */
    //存放当前票的状态到备忘录
    public Memento(TicketState ticketState, LocalDateTime dateTime)
    {
        this.ticketState = ticketState;
        this.dateTime=dateTime;
    }
}
