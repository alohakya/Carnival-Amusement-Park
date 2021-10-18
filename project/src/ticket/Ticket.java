package ticket;

import memento.Memento;
import state.*;

import java.time.LocalDateTime;

/**
 * 这个类用来记录购买的票的信息
 * 也是备忘录模式的发起人Originator
 * @author Yejingxin
 * */
public class Ticket {
    /**
     * 票的一些基本属性
     * */
    //票的种类，创建票的时候定义
    private String type;

    //票的价格，创建票的时候定义
    private int price;

    //票的编号
    private int number;

    //票的状态
    private TicketState ticketState;

    //记录票各个状态的时间
    private LocalDateTime dateTime;

    /**
     * 购票系统的一些设置变量的函数
     * */
    //构造函数
    public Ticket(){
        ticketState = new NotPurchased();//初始化默认用户暂时没有购票
        type="NULL";//游客未选择票的种类
        price=0;//价格为零元
        number=0;//无订单编号
        this.dateTime= LocalDateTime.now();//默认为创建时间
        saveMemento();
    }

    //设置票的种类的函数
    public  void setType(String type) {
        this.type = type;
    }

    //存储票价的函数
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获得private变量的一些函数*/
    //获取购票状态
    public TicketState getTicketState(){
        return this.ticketState;
    }

    //获取状态更改时间
    public LocalDateTime getDateTime(){
        return this.dateTime;
    }

    //存放当前票的状态到备忘录
    public Memento saveMemento() {
        return new Memento(this.ticketState,this.dateTime);
    }


    /**
     * 显示票的详细信息的一些函数
     * */

    //打印订单信息
    public void getTicket() {
        System.out.println("您已成功购买"+type+"!");
        System.out.println("您购买的"+type+"的价格是:"+price+"rmb");
        System.out.println("您的订单标号为："+number);
    }

    //打印当前购票状态
    public void printTicketState()
    {
        System.out.println("==========现在您的购票状态==========");
        this.ticketState.showState();
    }


    /**
     *     更改购票状态的函数
     */

    //更改购票状态
    public void changeTicketState(TicketState settingState)
    {
        System.out.println("注意：您的操作更改了购票状态！");
        this.ticketState = settingState;
        this.dateTime= LocalDateTime.now();
    }
    //买票更改状态
    public void buy() {
        changeTicketState(new ToBeUsed());
        saveMemento();
    }
    //退票更改状态
    public void refund() {
        changeTicketState(new Refunded());
        saveMemento();
    }
    //检票后更改状态
    public void check() {
        changeTicketState(new Used());
        saveMemento();
    }

}
