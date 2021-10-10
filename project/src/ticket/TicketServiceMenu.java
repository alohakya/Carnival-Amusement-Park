package ticket;

import java.util.Scanner;

import menu.GuestMenu;
import ticket.strategy.TicketType;//购票接口

public class TicketServiceMenu {
    public static void guestMenu(){
        System.out.println("\n==============================================================");
        System.out.println("============================票务服务============================");
        boolean flag=true;
        while(flag) {
            System.out.println("\n请输入具体数字选择您想要的服务！");
            System.out.println("1.购票服务\t\t2.检票服务\t\t3.退票服务\t\t4.退出票务服务界面");
            Scanner read = new Scanner(System.in);
            int choose = 1;
            //处理异常输入
            try {
                choose = read.nextInt();//跳过回车和空格直到找到一个字符（串）并试图将这个字符（串）变为数字
            } catch (RuntimeException e) {
                System.out.println("输入错误，已默认进入购票环节");
                read.nextLine(); //接着向下读取读取字符
            }
            if (choose > 4 || choose < 1) {
                System.out.println("输入错误，已默认选进入购票环节");
                choose = 1;
            }
            switch (choose) {
                case 1: {
                    System.out.println("***********************************************************");
                    System.out.println("**************************策略模式***************************");
                    System.out.println("**     嘉年华游乐园一共推出了以下五种票,请选择输入数字进行购票！     **");
                    System.out.println("**                                                       **");
                    System.out.println("**   1.儿童票           2.单人学生票         3.单人成人票     **");
                    System.out.println("**   4.双人情侣票        5.家庭票                           **");
                    System.out.println("**                                                       **");
                    System.out.println("***********************************************************");
                    Scanner read1 = new Scanner(System.in);
                    int choose1=0;
                    //处理异常输入
                    if(choose1!=1||choose!=2||choose1!=3||choose1!=4||choose1!=5){
                    try {
                        choose1 = read1.nextInt();//跳过回车和空格直到找到一个字符（串）并试图将这个字符（串）变为数字
                    } catch (RuntimeException e) {
                        System.out.println("输入错误!");
                        read.nextLine(); //接着向下读取读取字符
                    }
                    }
                    TicketType.chooseticket(choose1);

                    break;
                }
                case 2: {
                    System.out.println("22222");
                    break;
                }
                case 3: {
                    System.out.println("33333");
                    break;
                }
                case 4: {
                    System.out.println("44444");
                    break;
                }
                case 5: {
                    System.out.println("55555");
                    break;
                }
                case 6: {
                    System.out.println("您已成功退出用户界面！");
                    GuestMenu.guestMenu();
                    flag=false;
                    break;
                }
            }
        }
    }

}
