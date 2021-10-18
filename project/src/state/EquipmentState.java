package state;

/**
 * 状态模式抽象基类
 *
 * @function 为游乐设施的各个状态提供了抽象类，其子类有正常运行/维护中
 * @pattern 状态模式 State
 * @author Yejingxin
 */
public abstract class EquipmentState {
    protected String stateName;//状态名

    /**
     * 展示游乐设施的状态
     */
    public void showState()
    {
        System.out.println("设施当前处于 “" + stateName + "“ 状态");
    }

    /**
     * 获取当前游乐设施状态
     * @return 当前状态
     */
    public String getState()
    {
        return stateName;
    }
}
