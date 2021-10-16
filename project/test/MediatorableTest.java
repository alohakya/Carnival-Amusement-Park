import org.junit.jupiter.api.Test;
import mediator.*;

/**
 * 测试中介者客户端
 */
public class MediatorableTest {
    @Test
    public static void main(String[] args) {
        FacilityMediatorable mediator = new FacilityMediatorable();

        ChargeManager chargeManager = new ChargeManager(mediator);
        FacilityManager facilityManager = new FacilityManager(mediator);

        mediator.setChargeManager(chargeManager);
        mediator.setFacilityManager(facilityManager);


        facilityManager.send("设施损坏，申请报修！");
        chargeManager.send("收到您的消息，我将会在三天之内处理！");
    }
}
