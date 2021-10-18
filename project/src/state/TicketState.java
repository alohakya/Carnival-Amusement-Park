package state;

/**
 * 状态模式抽象基类
 *
 * @function 为票的各个状态提供了抽象类，其子类有未买票/已退票/已购买，未检票/检票成功，进入园区
 * @pattern 状态模式 State
 * @author Yejingxin
 */
public abstract class TicketState {
    protected String stateName;//状态名

    /**
     * 展示购票人的当前购票状态
     */
    public void showState()
    {
        System.out.println("您当前处于 “" + stateName + "“ 状态");
    }

    /**
     * 获取当前购票状态
     * @return 当前状态
     */
    public String getState()
    {
        return stateName;
    }
}
