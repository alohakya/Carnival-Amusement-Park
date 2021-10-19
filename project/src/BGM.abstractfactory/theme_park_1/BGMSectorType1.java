package BGM.abstractfactory.theme_park_1;

import BGM.abstractfactory.BGMFactory;

public class BGMSectorType1 extends BGMFactory {
    @Override
    public LightMusic_1 createLightMusic(String BGMName) {
        return new LightMusic_1(BGMName);
    }
    @Override
    public PopularMusic_1 createPopularMusic(String BGMName) {
        return new PopularMusic_1(BGMName);
    }
}
