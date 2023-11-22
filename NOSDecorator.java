abstract class NOSDecorator extends Car {
    private Car car;

    public NOSDecorator(String model, EngineBehavior engine, Car car) {
        super(model, engine);
        this.car = car;
    }

    @Override
    protected void engineInfo() {
        car.engineInfo();
    }
}