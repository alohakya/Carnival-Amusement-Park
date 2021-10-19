package costume.builder;

import util.CallStackLogger;
import util.CallStackLogInfo;

/**
 * abstract costume builder class
 */

public abstract class CostumeBuilder<pulbic> {
    protected String hat;
    protected String suit;
    protected String tops;
    protected String trousers;

    /**
     * set hat
     */
    public abstract void setHat();

    /**
     * set suit
     */
    public abstract void setSuit();

    /**
     * set tops
     */
    public abstract void setTops();

    /**
     * set Trousers
     */
    public abstract void setTrousers();

    /**
     * Produce a suit of costume
     */
    public Costume build(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "AbstractCostumeBuilder",
                        "build",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("选择%s的帽子、%s的外套、%s的上衣、%s的裤子搭配服装",this.hat, this.suit,this.tops,this.trousers)
                )
        );
        return new Costume(hat,suit,tops,trousers);
    }

}
