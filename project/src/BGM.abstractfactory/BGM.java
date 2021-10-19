package BGM.abstractfactory;

/**
 * 不同的BGM
 */

public abstract class BGM {
    private final int BGMId;
    private String BGMName;
    static private int counterId = 0;
    public BGM(String BGMName) {
        this.BGMId = counterId;
        counterId++;
        this.BGMName = BGMName;
    }
    public int getBGMId() {
        return BGMId;
    }
    public String getBGMName() {
        return BGMName;
    }
    public void setBGMName(String BGMName) {
        this.BGMName = BGMName;
    }

    /**
     * 播放BGM
     */
    public abstract void run();
}
