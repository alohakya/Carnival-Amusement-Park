package facility;

import visitor.*;

/**
 * 具体元素类，旋转木马
 */
public class Carousel extends FacilityAbstract {
    public Carousel(String name) {
        super(name);
        oneTimesNumber = 30;
    }

    @Override
    public void accept(Visitorable visitor) {
        visitor.visit(this);
    }
}
