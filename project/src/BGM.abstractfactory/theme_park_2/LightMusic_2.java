package BGM.abstractfactory.theme_park_2;

import BGM.abstractfactory.LightMusic;
import util.CallStackLogInfo;
import util.CallStackLogger;

/**
 * 主题园区2的轻音乐BGM
 */

public class LightMusic_2 extends LightMusic{
    public LightMusic_2(String BGMName) {
        super(BGMName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LightMusic_2",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "主题园区2的轻音乐BGM\""+getBGMName()+"\"正在播放"
                )
        );
    }
}