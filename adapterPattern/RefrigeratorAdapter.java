package adapterPattern;
public class RefrigeratorAdapter {
    private Refrigerator refrigerator;

    public RefrigeratorAdapter (Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void plugin() {
        refrigerator.startCooling();
    }
}
