package prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : prototype
 * @ClassName : Ticket.java
 * @createTime : 2021/10/19 20:05
 * @Email : 249195279@qq.com
 * @Description :不同种类的票
 */
public class Ticket implements Cloneable{
    private String name;
    public Ticket(String name){
        this.name=name;
    }
    public void SetName(String name){
        this.name=name;
    }
    public void GetName(){
        System.out.println("这把椅子是"+this.name);
    }
    @Override
    public Ticket clone(){
        try{
            return (Ticket)super.clone();
        }catch (CloneNotSupportedException e){
            throw new InternalError();
        }
    }
}
