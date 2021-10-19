package builder;

import costume.builder.*;
import org.testng.annotations.Test;

public class BuilderTest {

    @Test
    void testBuilder() {
        CostumeDirector costumeDirector = new CostumeDirector();

        CostumeBuilder cartoonCostumeBuilder = new CartoonCostumeBuilder();
        costumeDirector.setCostumeBuilder(cartoonCostumeBuilder);
        costumeDirector.construct();
        Costume cartoonCostume = cartoonCostumeBuilder.build();
        cartoonCostume.wear();

        CostumeBuilder cowboyCostumeBuilder = new CowBoyCostumeBuilder();
        costumeDirector.setCostumeBuilder(cowboyCostumeBuilder);
        costumeDirector.construct();
        Costume cowboyCostume = cowboyCostumeBuilder.build();
        cowboyCostume.wear();

    }
}
