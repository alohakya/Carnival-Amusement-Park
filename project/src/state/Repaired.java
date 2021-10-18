package state;

import constant.Const;

/**
 * 游乐设施状态类
 *
 * @function 将游乐设施维护中状态抽象为状态类
 * @pattern 状态模式 State
 * @author Yejingxin
 */

public class Repaired extends EquipmentState{
    /**
     * 构造函数
     */
    public Repaired()
    {
        stateName = Const.REPAIRED;
    }
}
