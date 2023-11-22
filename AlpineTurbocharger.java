public class AlpineTurbocharger extends Turbocharger {
    public AlpineTurbocharger(Car car) {
        super("Alpine Turbocharger", car.getEngine(), car);
    }

    @Override
    protected void engineInfo() {
        super.engineInfo();
        System.out.println("Additional Information: Alpine Turbocharger");
    }
    @Override
    protected String getTurbochargerType() {
        return "Alpine";
    }
}