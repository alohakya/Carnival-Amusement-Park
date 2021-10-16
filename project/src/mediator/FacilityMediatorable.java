package mediator;

public class FacilityMediatorable implements Mediatorable {
    private ChargeManager chargeManager;
    private FacilityManager facilityManager;

    public void setChargeManager(ChargeManager chargeManager){
        this.chargeManager = chargeManager;
    }

    public void setFacilityManager(FacilityManager facilityManager){
        this.facilityManager = facilityManager;
    }

    @Override
    public void sendMessage(String message, ManagerAbstract managerAbstract) {
        if (managerAbstract == chargeManager) {
            chargeManager.notify(message);
        } else if (managerAbstract == facilityManager) {
            facilityManager.notify(message);
        }
    }


}
