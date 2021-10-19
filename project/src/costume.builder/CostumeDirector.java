package costume.builder;

import util.CallStackLogger;
import util.CallStackLogInfo;


/**
 * costume director class
 */

public class CostumeDirector {
    private CostumeBuilder costumeBuilder;
    /**
     * set builder
     *
     * @param costumeBuilder the builder
     */
    public void setCostumeBuilder(CostumeBuilder costumeBuilder) {
        this.costumeBuilder = costumeBuilder;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CostumeBuilder",
                        "CostumeBuilder",
                        String.valueOf(System.identityHashCode(this)),
                        "设置特定建造者"
                )
        );

    }

    /**
     * direct the collocation of costume
     */
    public void construct() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SmoothieDirector",
                        "construct",
                        String.valueOf(System.identityHashCode(this)),
                        "指导服装的搭配"
                )
        );
        costumeBuilder.setHat();
        costumeBuilder.setSuit() ;
        costumeBuilder.setTops() ;
        costumeBuilder.setTrousers();
    }

}
