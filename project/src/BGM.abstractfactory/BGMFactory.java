package BGM.abstractfactory;

/**
 * 不同园区的BGM
 */

public abstract class BGMFactory {
    /**
     * 创建纯音乐的方法
     *
     * @param BGMName BGM的名字，用以展示
     * @return 创建的BGM
     *
     */
    public abstract LightMusic createLightMusic(String BGMName);
    /**
     * 创建流行音乐方法
     *
     * @param BGMName BGM的名字，用以展示
     * @return 创建的BGM
     *
     */
    public abstract PopularMusic createPopularMusic(String BGMName);

}
