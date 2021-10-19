package abstractfactory;

import BGM.abstractfactory.theme_park_1.LightMusic_1;
import BGM.abstractfactory.theme_park_1.PopularMusic_1;
import BGM.abstractfactory.theme_park_1.BGMSectorType1;
import BGM.abstractfactory.theme_park_2.LightMusic_2;
import BGM.abstractfactory.theme_park_2.PopularMusic_2;
import BGM.abstractfactory.theme_park_2.BGMSectorType2;

import org.testng.annotations.Test;


public class FactoryTest {
    @Test
    void testFactory() {
        BGMSectorType1 sector1 = new BGMSectorType1();
        BGMSectorType2 sector2 = new BGMSectorType2();
        LightMusic_1 lm1 = sector1.createLightMusic("summer");
        PopularMusic_1 pm1 = sector1.createPopularMusic("好久不见");
        LightMusic_2 lm2 = sector2.createLightMusic("致爱丽丝");
        PopularMusic_2 pm2 = sector2.createPopularMusic("有点甜");
        lm1.run();
        pm1.run();
        lm2.run();
        pm2.run();
    }
}

