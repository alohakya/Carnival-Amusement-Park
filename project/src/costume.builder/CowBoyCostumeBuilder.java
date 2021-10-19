package costume.builder;

import util.CallStackLogger;
import util.CallStackLogInfo;

/**
 * cowboy  style costume
 */

public class CowBoyCostumeBuilder extends CostumeBuilder{
    /**
     * 设置costume帽子为牛仔帽
     */
    @Override
    public void setHat() {
        this.hat = "棕黄色牛仔";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setHat",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装的帽子为棕黄色牛仔帽"
                )
        );
    }

    /**
     * 设置costume外套为黄色牛仔外套
     */
    @Override
    public void setSuit() {
        this.suit = "黄色皮质";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setSuit",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装外套为黄色皮质外套"
                )
        );
    }

    /**
     * 设置costume上衣为白色短袖上衣
     */
    @Override
    public void setTops() {
        this.tops = "白色短袖";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setTops",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装外套为白色短袖上衣"
                )
        );
    }

    /**
     * 设置costume裤子为蓝色牛仔裤
     */
    @Override
    public void setTrousers() {
        this.trousers = "蓝色牛仔";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setTrousers",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装裤子为蓝色牛仔裤"
                )
        );
    }
}
