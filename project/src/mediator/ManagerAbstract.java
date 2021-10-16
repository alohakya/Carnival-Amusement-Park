package mediator;

public abstract class ManagerAbstract {
    protected Mediatorable mediator;

    public ManagerAbstract(Mediatorable mediator) {
        this.mediator = mediator;
    }

}
