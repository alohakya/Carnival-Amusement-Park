package ticket.strategy;

import java.util.Random;

public class GenerateNumber {
    private int type;
    int [] orderlist;

    public GenerateNumber(int type) {
        this.type = type;
    }

    //用随机数产生订单编号
   public int createrandomnumber(){
       int r;//用来保存随机数
       Random rand = new Random();
       switch (type){
           case 1:{
               r=rand.nextInt(10000000)+ 100000000;
               orderlist[orderlist.length-1]=r;
               return r;
           }
           case 2:{
               r=rand.nextInt(10000000)+ 200000000;
               orderlist[orderlist.length-1]=r;
               return r;
           }
           case 3:{
               r=rand.nextInt(10000000)+ 300000000;
               orderlist[orderlist.length-1]=r;
               return r;
           }
           case 4:{
               r=rand.nextInt(10000000)+ 400000000;
               orderlist[orderlist.length-1]=r;
               return r;
           }
           case 5:{
               r=rand.nextInt(10000000)+ 500000000;
               orderlist[orderlist.length-1]=r;
               return r;
           }
       }
       return 1;
   }

   //寻找订单编号
    public void searchOrder(int orderNumber){
        for(int i=0;i< orderlist.length;i++){
            if( orderNumber==orderlist[i]){
                if(orderNumber>=100000000&&orderNumber<200000000){
                    System.out.println("您购买的是儿童票！");
                }
                else if(orderNumber>=200000000&&orderNumber<300000000){
                    System.out.println("您购买的是儿童票！");
                }
            }
        }
    }

}
