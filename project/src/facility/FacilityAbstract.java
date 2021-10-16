package facility;

import visitor.*;
import java.util.Random;

/**
 * 抽象元素类，抽出游玩设施共同属性
 */
public abstract class FacilityAbstract implements FacilityAcceptorable {
    public String name;// 设施名字
    public int currentNumber;// 当前排队人数
    public int oneTimesNumber;// 一次可游玩人数
    private boolean currentStatus;// 设施当前状态

    public FacilityAbstract(String name) {// 构造函数，初始化
        this.name = name;
        this.currentNumber = new Random().nextInt(100);// 随机产生当前排队的人数[0,100]
        this.currentStatus = true;
    }

    public boolean getCurrentStatus() {// 获取当前状态
        return currentStatus;
    }

    public void setCurrentStatus(boolean status) {// 设置当前状态
        this.currentStatus = status;
    }

    public void printWaitInfo() {// 打印提示信息
        if (currentNumber > oneTimesNumber) {
            int waitNumber = currentNumber - oneTimesNumber - 1;
            System.out.println("您前面还有" + waitNumber + "人在等待！");
        }
    }

}
