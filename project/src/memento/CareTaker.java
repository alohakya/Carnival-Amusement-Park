package memento;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式的管理者
 *
 * @function 存储所有购票人购票状态
 * @pattern Memento
 * @author Yejinxin
 **/

public class CareTaker {
    //在 List 集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //打印所有购票状态信息
    public void getAllTicketState() {
        //打印日期时间的格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("======== 使用备忘录 Memento 模式 ========");
        System.out.println("模式：Memento");
        System.out.println("方法名：CareTaker.getAllTicketState()");
        System.out.println("功能描述：打印购票者所有购票状态信息");
        System.out.println("======================================");

        for (int i = 0; i < mementoList.size(); i++) {
            System.out.println("购票状态："+mementoList.get(i).ticketState);
            System.out.println("更新时间："+mementoList.get(i).dateTime.format(formatter));
        }
    }
}
