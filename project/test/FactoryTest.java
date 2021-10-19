import factory.Actor;
import factory.ActorList;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : PACKAGE_NAME
 * @ClassName : FactoryTest.java
 * @createTime : 2021/10/19 17:28
 * @Email : 249195279@qq.com
 * @Description :演员工厂————演员名单表
 */
public class FactoryTest {
    @Test
    void test(){
        ActorList actorlist=new ActorList();

        Actor zootopia=actorlist.PrintList("Zootopia");
        zootopia.print();

        Actor frozen=actorlist.PrintList("Frozen");
        frozen.print();

        Actor moana=actorlist.PrintList("Moana");
        moana.print();
    }
}
