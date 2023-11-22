class Sema extends NOSDecorator implements NOS {
    public Sema(EngineBehavior engine, Car car) {
        super("Sema", engine, car);
    }

    @Override
    public void accelerate() {
        System.out.println("Sema NOS accelerating.");
    }

    @Override
    public void stop() {
        System.out.println("Sema NOS stopped.");
    }
}
