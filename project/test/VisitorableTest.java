import org.junit.jupiter.api.Test;
import facility.*;
import visitor.*;

/**
 * 测试访问者客户端
 */
public class VisitorableTest {
    @Test

    public static void main(String[] args) {
        WaitNumberVisitorable waitNumberVisitor = new WaitNumberVisitorable();

        Carousel carousel = new Carousel("温和的旋转木马");
        RollerCoaster rollerCoaster = new RollerCoaster("刺激的过山车");

        carousel.accept(waitNumberVisitor);
        rollerCoaster.accept(waitNumberVisitor);
    }
}
