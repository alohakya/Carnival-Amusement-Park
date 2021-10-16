package mediator;

public class FacilityManager extends ManagerAbstract {
    public String name;

    public FacilityManager(Mediatorable mediator) {
        super(mediator);
        name = "旋转木马经理";
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void notify(String message) {
        System.out.println(name+"得到消息：" + message);
    }
}
