package visitor;
import facility.*;

public class WaitNumberVisitorable implements Visitorable {
    @Override
    public void visit(Carousel carousel) {
        System.out.println("您正位于设施：" + carousel.name + "！");
        System.out.println("当前排队人数：" + carousel.currentNumber);
        System.out.println("一次可游玩人数：" + carousel.oneTimesNumber);
    }

    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("您正位于设施：" + rollerCoaster.name + "！");
        System.out.println("当前排队人数：" + rollerCoaster.currentNumber);
        System.out.println("一次可游玩人数：" + rollerCoaster.oneTimesNumber);
    }
}
