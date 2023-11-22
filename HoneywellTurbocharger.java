public class HoneywellTurbocharger extends Turbocharger {
    public HoneywellTurbocharger(Car car) {
        super("Honeywell Turbocharger", car.getEngine(), car);
    }

    @Override
    protected String getTurbochargerType() {
        return "Honeywell";
    }

    @Override
protected void engineInfo() {
    super.engineInfo();
    System.out.println("Turbocharger Type: Honeywell");
}

}
