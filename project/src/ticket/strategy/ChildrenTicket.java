package ticket.strategy;

public class ChildrenTicket implements TicketType {
    @Override
    public void chooseticket() {
        System.out.println("You have selected a children's ticket！");
        System.out.println("您已选择了儿童票！");
        GenerateNumber ordernumber =new GenerateNumber(1);
        System.out.println("您的订单编号为："+ordernumber.createrandomnumber()+"\n");
    }
}
