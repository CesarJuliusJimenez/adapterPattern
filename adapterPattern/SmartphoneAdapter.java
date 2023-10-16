package adapterPattern;
public class SmartphoneAdapter {
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter (SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    public void plugin() {
        smartphoneCharger.chargePhone();
    }
}
