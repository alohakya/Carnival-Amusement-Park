package ticket.strategy;

public class DoubleCoupleTicket implements TicketType {
    @Override
    public void chooseticket() {
        System.out.println("You have selected an adult couple ticket！");
        System.out.println("您已选择了成人情侣票！");
        GenerateNumber ordernumber =new GenerateNumber(4);
        System.out.println("您的订单编号为："+ordernumber.createrandomnumber()+"\n");
    }
}