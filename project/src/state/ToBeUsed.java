package state;

import constant.Const;

/**
 * 游客购票状态类
 *
 * @function 将游客未检票状态抽象为状态类
 * @pattern 状态模式 State
 * @author Yejingxin
 */

public class ToBeUsed extends TicketState{
    /**
     * 构造函数
     */
    public ToBeUsed()
    {
        stateName = Const.TICKET_STATE[2];
    }
}
