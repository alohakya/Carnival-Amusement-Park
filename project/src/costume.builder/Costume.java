package costume.builder;

import util.CallStackLogger;
import util.CallStackLogInfo;

/**
 * costume Product class
 */

public class Costume {
    private final String hat;
    private final String suit;
    private final String tops;
    private final String trousers;

    /**
     *  @param hat 服装的帽子
     *  @param suit 服装的外套
     *  @param tops 服装的上衣
     *  @param trousers 服装的裤子
     */

    public Costume(String hat, String suit,String tops,String trousers) {
        this.hat=hat;
        this.suit = suit;
        this.tops= tops;
        this.trousers=trousers;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Costume",
                        "Costume",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("搭配好%s的帽子、%s的外套、%s的上衣、%s的裤子的服装",this.hat, this.suit,this.tops,this.trousers)
                )
        );
    }

    /**
     * 展示产品
     */
    public void wear() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Costume",
                        "wear",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("穿上了%s的帽子、%s的外套、%s的上衣、%s的裤子的服装",this.hat, this.suit,this.tops,this.trousers)
                )
        );
    }





}
