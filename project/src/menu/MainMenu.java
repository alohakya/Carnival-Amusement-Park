package menu;

import java.util.Scanner;

public class MainMenu {
    //主菜单
    public static int mainMenu() {
        System.out.println("\n========================================================");
        System.out.println("欢迎来到嘉年华游乐园,请输入数字选择您的身份!");
        boolean flag=true;
        while (flag) {
            Scanner read = new Scanner(System.in);
            System.out.println("1---游客\t\t\t2---管理员\t\t\t3---退出系统");
            int status = 1;
            //处理异常输入
            try {
                status = read.nextInt();//跳过回车和空格直到找到一个字符（串）并试图将这个字符（串）变为数字
            } catch (RuntimeException e) {
                System.out.println("输入错误，已默认选择游客身份\n");
                read.nextLine(); //接着向下读取读取字符
            }
            if (status > 3 || status < 1) {
                System.out.println("输入错误，已默认选择游客身份\n");
                status = 1;
            }

            switch (status) {
                case 1: {
                    GuestMenu.guestMenu();
                    flag=false;
                    break;
                }
                case 2: {
                    ManagerMenu.managerMenu();
                    flag=false;
                    break;
                }
                case 3: {
                    System.out.println("您已成功退出系统！");
                    flag=false;
                    break;
                }
            }
        }
        return 0;
    }

    //主函数
    public static void main(String[] args) {
        MainMenu mainMenu =new MainMenu();
        mainMenu.mainMenu();
    }
}


