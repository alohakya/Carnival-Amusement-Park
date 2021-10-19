package BGM.abstractfactory.theme_park_1;

import BGM.abstractfactory.LightMusic;
import util.CallStackLogInfo;
import util.CallStackLogger;

/**
 * 主题园区1的轻音乐BGM
 */

public class LightMusic_1 extends LightMusic{
    public LightMusic_1(String BGMName) {
        super(BGMName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LightMusic_1",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "主题园区1的轻音乐BGM\""+getBGMName()+"\"正在播放"
                )
        );
    }
}
