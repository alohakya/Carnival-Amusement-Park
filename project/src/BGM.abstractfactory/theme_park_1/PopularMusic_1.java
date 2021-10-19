package BGM.abstractfactory.theme_park_1;

import BGM.abstractfactory.PopularMusic;
import util.CallStackLogInfo;
import util.CallStackLogger;

/**
 * 主题园区1的流行音乐BGM
 */

public class PopularMusic_1 extends PopularMusic {
    public PopularMusic_1(String BGMName) {
        super(BGMName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "PopularMusic_1",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "主题园区1的流行音乐BGM\""+getBGMName()+"\"正在播放"
                )
        );
    }
}
