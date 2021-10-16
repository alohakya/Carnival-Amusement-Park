package facility;

import visitor.*;

/**
 * 具体元素类，旋转木马
 */
public class RollerCoaster extends FacilityAbstract {
    public RollerCoaster(String name) {
        super(name);
        oneTimesNumber = 50;
    }

    @Override
    public void accept(Visitorable visitor) {
        visitor.visit(this);
    }
}
