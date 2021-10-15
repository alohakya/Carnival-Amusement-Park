import AbstractFactory.*;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void test() {

        /**
         * 获取生产证件的工厂
         */
        AbstractFactory cardFactory = FactoryProducer.getFactory("CARD");

        /**
         * 获取卡片种类为KEEPER的对象
         */
        Card card1 = cardFactory.getCard("KEEPER");

        /**
         * 调用 KEEPER 的 produce 方法
         */
        card1.produce();

        /**
         * 获取卡片种类为PRODUCER的对象
         */
        Card card2 = cardFactory.getCard("PRODUCER");

        /**
         * 调用PRODUCER的 produce 方法
         */
        card2.produce();

        /**
         * 获取卡片种类为PACKAGER的对象
         */
        Card card3 = cardFactory.getCard("PACKAGER");

        /**
         * 调用PACKAGER的 produce 方法
         */
        card3.produce();

        /**
         * 获取生产制服的工厂
         */

        AbstractFactory uniformFactory = FactoryProducer.getFactory("UNIFORM");

        /**
         * 获取制服颜色为RED的对象
         */
        Uniform uniform1 = uniformFactory.getUniform("RED");

        /**
         * 调用 RED 的 make 方法
         */
        uniform1.make();

        /**
         * 获取制服颜色为 BLUE 的对象
         */
        Uniform uniform2 = uniformFactory.getUniform("BLUE");

        /**
         * 调用 BLUE 的 make 方法
         */
        uniform2.make();

        /**
         * 获取制服颜色为 YELLOW 的对象
         */
        Uniform uniform3 = uniformFactory.getUniform("YELLOW");

        /**
         * 调用 YELLOW 的 make 方法
         */
        uniform3.make();
    }
}
