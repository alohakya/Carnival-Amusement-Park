package factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : factory
 * @ClassName : Moana.java
 * @createTime : 2021/10/19 18:17
 * @Email : 249195279@qq.com
 * @Description :海洋奇缘演员名单
 */
public class Moana implements Actor{
    public static final String[] actors={"Moana","Maui","Tala","Tui"};
    @Override
    public void print(){
        System.out.println("名单如下：");
        for (String actor:actors){
            System.out.println(actor);
        }
    }
}
