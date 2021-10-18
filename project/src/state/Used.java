package state;

import constant.Const;

/**
 * 游客购票状态类
 *
 * @function 将游客已使用门票状态抽象为状态类
 * @pattern 状态模式 State
 * @author Yejingxin
 */

public class Used extends TicketState{
    /**
     * 构造函数
     */
    public Used()
    {
        stateName = Const.TICKET_STATE[3];
    }
}
