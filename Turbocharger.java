public abstract class Turbocharger extends Car {
    private Car car;

    public Turbocharger(String model, EngineBehavior engine, Car car) {
        super(model, engine);
        this.car = car;
    }

    @Override
    protected void engineInfo() {
        car.engineInfo();
    }

    protected abstract String getTurbochargerType();

    public void turbochargerInfo() {
        System.out.println("Turbocharger Type: " + getTurbochargerType());
    }
}
