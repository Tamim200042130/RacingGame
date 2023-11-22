class Resonac extends NOSDecorator implements NOS {
    public Resonac(EngineBehavior engine, Car car) {
        super("Resonac", engine, car);
    }

    @Override
    public void accelerate() {
        System.out.println("Resonac NOS accelerating.");
    }

    @Override
    public void stop() {
        System.out.println("Resonac NOS stopped.");
    }
}
