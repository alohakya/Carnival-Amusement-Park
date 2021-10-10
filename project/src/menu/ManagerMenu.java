package menu;

import menu.MainMenu;

import java.util.Scanner;

public class ManagerMenu {
    public static void managerMenu(){
        System.out.println("\n========================================================");
        System.out.println("尊敬的游客，欢迎您来到嘉年华游乐园~");
        boolean flag=true;
        while(flag) {
            System.out.println("\n请输入具体数字选择您想要的服务！");

            System.out.println("1.修建乐园\t\t2.人事管理\t\t3.主题活动\t\t4.退出管理者界面");
            Scanner read = new Scanner(System.in);
            int choose = 1;
            //处理异常输入
            try {
                choose = read.nextInt();//跳过回车和空格直到找到一个字符（串）并试图将这个字符（串）变为数字
            } catch (RuntimeException e) {
                System.out.println("输入错误，已默认进入修建乐园环节");
                read.nextLine(); //接着向下读取读取字符
            }
            if (choose > 4 || choose < 1) {
                System.out.println("输入错误，已默认进入修建乐园环节");
                choose = 1;
            }
            switch (choose) {
                case 1: {
                    System.out.println("1111");
                    break;
                }
                case 2: {
                    System.out.println("2222");
                    break;
                }
                case 3: {
                    System.out.println("3333");
                    break;
                }
                case 4: {
                    System.out.println("您已成功退出管理员界面！");
                    MainMenu.mainMenu();
                    flag=false;
                    break;
                }
            }
        }
    }
}
