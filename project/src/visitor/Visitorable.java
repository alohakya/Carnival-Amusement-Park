package visitor;

import facility.*;

public interface Visitorable {// test
    void visit(Carousel carousel);// 访问旋转木马类

    void visit(RollerCoaster rollerCoaster);// 访问过山车类

}
