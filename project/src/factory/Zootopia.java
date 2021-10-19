package factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : factory
 * @ClassName : Zootopia.java
 * @createTime : 2021/10/19 18:01
 * @Email : 249195279@qq.com
 * @Description :疯狂动物城演员名单
 */
public class Zootopia implements Actor{
    public static final String[] actors={"Judy Hopps","Nickolas Wilde"};
    @Override
    public void print(){
        System.out.println("名单如下：");
        for (String actor:actors){
            System.out.println(actor);
        }
    }
}
