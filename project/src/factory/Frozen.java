package factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : factory
 * @ClassName : Frozen.java
 * @createTime : 2021/10/19 18:13
 * @Email : 249195279@qq.com
 * @Description :冰雪奇缘演员名单
 */
public class Frozen implements Actor{
    public static final String[] actors={"Anna","Elsa"};
    @Override
    public void print(){
        System.out.println("名单如下：");
        for (String actor:actors){
            System.out.println(actor);
        }
    }
}
