package ticket.strategy;

public class SingleStudentTicket implements TicketType {
    @Override
    public void chooseticket() {
        System.out.println("You have selected a single student ticket！");
        System.out.println("您已选择了单人学生票！");
        GenerateNumber ordernumber =new GenerateNumber(2);
        System.out.println("您的订单编号为："+ordernumber.createrandomnumber()+"\n");
    }
}
