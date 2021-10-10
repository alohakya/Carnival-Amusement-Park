package menu;

import java.util.Scanner;
import ticket.TicketServiceMenu;

public class GuestMenu {
    public static void guestMenu(){
        System.out.println("\n========================================================");
        System.out.println("尊敬的游客，欢迎您来到嘉年华游乐园~");
        boolean flag=true;
        while(flag) {
            System.out.println("\n请输入具体数字选择您想要的服务！");
            System.out.println("1.票务服务\t\t2.游乐园详情\t\t3.游园须知");
            System.out.println("4.意外事故\t\t5.纪念品商店\t\t6.退出游客界面");
            Scanner read = new Scanner(System.in);
            int choose = 1;
            //处理异常输入
            try {
                choose = read.nextInt();//跳过回车和空格直到找到一个字符（串）并试图将这个字符（串）变为数字
            } catch (RuntimeException e) {
                System.out.println("输入错误，已默认选择票务服务");
                read.nextLine(); //接着向下读取读取字符
            }
            if (choose > 6 || choose < 1) {
                System.out.println("输入错误，已默认选择票务服务");
                choose = 1;
            }
            switch (choose) {
                case 1: {
                    System.out.println("11111");
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
                    MainMenu.mainMenu();
                    flag=false;
                    break;
                }
            }
        }
    }
}
