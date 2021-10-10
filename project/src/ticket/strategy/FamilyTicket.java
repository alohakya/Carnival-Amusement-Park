package ticket.strategy;

public class FamilyTicket implements TicketType {
    @Override
    public void chooseticket() {
        System.out.println("You have selected a family ticket!");
        System.out.println("您已选择了家庭票！");
        GenerateNumber ordernumber =new GenerateNumber(5);
        System.out.println("您的订单编号为："+ordernumber.createrandomnumber()+"\n");
    }
}

