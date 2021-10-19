import org.junit.jupiter.api.Test;
import prototype.Ticket;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : PACKAGE_NAME
 * @ClassName : PrototypeTest.java
 * @createTime : 2021/10/19 20:11
 * @Email : 249195279@qq.com
 * @Description :原型模式————票
 */
public class PrototypeTest {
    @Test
    void test(){
        var original=new Ticket("成人票");

        var child_ticket=original.clone();
        child_ticket.SetName("儿童票");

        var couple_ticket=original.clone();
        couple_ticket.SetName("情侣票");

        var family_ticket=original.clone();
        family_ticket.SetName("家庭票");

        var student_ticket=original.clone();
        student_ticket.SetName("学生票");

        original.GetName();
        child_ticket.GetName();
        couple_ticket.GetName();
        family_ticket.GetName();
        student_ticket.GetName();
    }
}
