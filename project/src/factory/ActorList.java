package factory;

import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : factory
 * @ClassName : ActorList.java
 * @createTime : 2021/10/19 17:44
 * @Email : 249195279@qq.com
 * @Description :
 */
public class ActorList {
    /* 根据片名输出演员表 */
    public Actor PrintList(String MovieName){
        return switch (MovieName){
            case "Zootopia" -> new Zootopia();
            case "Frozen" -> new Frozen();
            case "Moana" -> new Moana();
            default -> throw new NoSuchElementException("No such movie.");
        };
    }
}
