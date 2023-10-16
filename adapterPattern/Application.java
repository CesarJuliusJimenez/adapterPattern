package adapterPattern;
public class Application {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        laptop.charge();
        refrigerator.startCooling();
        smartphoneCharger.chargePhone();
        // Cesar Julius D. Jimenez || 3 - BSCS - 1";
    }
}