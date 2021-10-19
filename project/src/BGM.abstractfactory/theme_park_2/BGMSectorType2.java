package BGM.abstractfactory.theme_park_2;

import BGM.abstractfactory.BGMFactory;

public class BGMSectorType2 extends BGMFactory {
    @Override
    public LightMusic_2 createLightMusic(String BGMName) {
        return new LightMusic_2(BGMName);
    }
    @Override
    public PopularMusic_2 createPopularMusic(String BGMName) {
        return new PopularMusic_2(BGMName);
    }
}

