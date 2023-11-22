public class CumminsTurbocharger extends Turbocharger {
    public CumminsTurbocharger(Car car) {
        super("Cummins Turbocharger", car.getEngine(), car);
    }

    @Override
    protected String getTurbochargerType() {
        return "Cummins";
    }

    @Override
    protected void engineInfo() {
        System.out.println("Cummins Turbocharger Engine Info");
    }
}
