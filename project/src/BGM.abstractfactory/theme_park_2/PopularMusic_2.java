package BGM.abstractfactory.theme_park_2;

import BGM.abstractfactory.PopularMusic;
import util.CallStackLogInfo;
import util.CallStackLogger;

/**
 * 主题园区2的流行音乐BGM
 */

public class PopularMusic_2 extends PopularMusic {
    public PopularMusic_2(String BGMName) {
        super(BGMName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "PopularMusic_2",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "主题园区2的流行音乐BGM\""+getBGMName()+"\"正在播放"
                )
        );
    }
}
