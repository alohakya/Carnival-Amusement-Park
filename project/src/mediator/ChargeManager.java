package mediator;

public class ChargeManager extends ManagerAbstract {
    public String managerName;

    public ChargeManager(Mediatorable mediator) {
        super(mediator);
        managerName = "主管经理";
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void notify(String message) {
        System.out.println("主管得到消息：" + message);
    }
}
