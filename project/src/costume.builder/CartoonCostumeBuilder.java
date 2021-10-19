package costume.builder;

import util.CallStackLogInfo;
import util.CallStackLogger;

/**
 * cartoon style costume
 */

public class CartoonCostumeBuilder extends CostumeBuilder {

    /**
     * 设置costume帽子为米奇头套
     */
    @Override
    public void setHat() {
        this.hat = "米奇头套";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setHat",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装的帽子为米奇头套"
                )
        );
    }

    /**
     * 设置costume外套为黑色西装外套
     */
    @Override
    public void setSuit() {
        this.suit = "米奇同款";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setSuit",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装外套为米奇同款外套"
                )
        );
    }

    /**
     * 设置costume上衣为米奇衬衫
     */
    @Override
    public void setTops() {
        this.tops = "米奇同款衬衫";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setTops",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装上衣为米奇衬衫"
                )
        );
    }

    /**
     * 设置costume裤子为米奇裤子
     */
    @Override
    public void setTrousers() {
        this.trousers = "米奇同款";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CowBoyCostumeBuilder",
                        "setTrousers",
                        String.valueOf(System.identityHashCode(this)),
                        "设置服装裤子为米奇同款裤子"
                )
        );
    }
}
