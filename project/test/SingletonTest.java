import org.junit.jupiter.api.Test;
import singleton.VisitTip;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : PACKAGE_NAME
 * @ClassName : SingletonTest.java
 * @createTime : 2021/10/19 19:52
 * @Email : 249195279@qq.com
 * @Description :单例模式测试————入园须知
 */
public class SingletonTest {
    @Test
    void test(){
        VisitTip tip1=VisitTip.getInstance();
        VisitTip tip2=VisitTip.getInstance();
        assertSame(tip1,tip2);
    }
}
