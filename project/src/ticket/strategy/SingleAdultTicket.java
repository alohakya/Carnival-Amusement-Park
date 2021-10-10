package ticket.strategy;

public class SingleAdultTicket implements TicketType {
    @Override
    public void chooseticket() {
        System.out.println("You have selected a single adult ticket！");
        System.out.println("您已选择了单人成人票！");
        GenerateNumber ordernumber =new GenerateNumber(3);
        System.out.println("您的订单编号为："+ordernumber.createrandomnumber()+"\n");
    }
}
