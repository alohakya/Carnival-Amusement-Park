import strategy.*;

import org.junit.jupiter.api.Test;

/**
 * 测试购票策略模式
 * 五种购票策略：成人票/儿童票/情侣票/家庭票/学生票
 * */

public class StrategyTest {
    @Test
    public void test() {

        /**
         * 打印购票界面
         * */
        System.out.println("========== 欢迎来到买票服务窗口 ==========");
        System.out.println("我们为您提供以下五种票型，请按需求购买！\n");
        System.out.println("*****************成人票****************");
        System.out.println("票价：200rmb");
        System.out.println("使用要求:18岁以上，60岁以下");
        System.out.println("购买成人票请输入数字 1 \n");
        System.out.println("*****************儿童票****************");
        System.out.println("票价：100rmb");
        System.out.println("使用要求:18岁以下");
        System.out.println("购买儿童票请输入数字 2 \n");
        System.out.println("*****************情侣票****************");
        System.out.println("票价：360rmb");
        System.out.println("使用要求:18岁以上，一男一女，同时入园");
        System.out.println("购买情侣票请输入数字 3 \n");
        System.out.println("*****************家庭票****************");
        System.out.println("票价：400rmb");
        System.out.println("使用要求:父母双方允许携带一位18岁以下儿童");
        System.out.println("家庭票仅包含一位儿童，18岁以上请单独买票！");
        System.out.println("购买成人票请输入数字 4 \n");
        System.out.println("*****************学生票****************");
        System.out.println("票价：120rmb");
        System.out.println("使用要求:全日制在校本科生、研究生");
        System.out.println("入院时请携带学生证！");
        System.out.println("购买学生票请输入数字 5 ");
        System.out.println("=====================================");

        /**
         * 具体购票测试
         * */
        TicketStrategy a=new AdultTicket();
        a.buyTicket();
        TicketStrategy b=new ChildTicket();
        b.buyTicket();
        TicketStrategy c=new CoupleTicket();
        c.buyTicket();
        TicketStrategy d=new FamilyTicket();
        d.buyTicket();
        TicketStrategy e=new StudentTicket();
        e.buyTicket();


        /**
         * 具体购票
         * */
//        TicketStrategy a;
//        Scanner input = new Scanner(System.in);
//        String choice = input.next();
//        switch (choice)
//        {
//            case "1":
//                a=new AdultTicket();
//                a.buyTicket();
//                break;
//            case "2":
//                a=new ChildTicket();
//                a.buyTicket();
//                break;
//            case "3":
//                a=new CoupleTicket();
//                a.buyTicket();
//                break;
//            case "4":
//                a=new FamilyTicket();
//                a.buyTicket();
//                break;
//            case "5":
//                a=new StudentTicket();
//                a.buyTicket();
//                break;
//            default:
//                System.out.println("您输入的指令有误，请重新输入!");
//                break;
//        }
    }
}
