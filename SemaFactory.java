class SemaFactory implements NOSFactory {
    private final EngineBehavior engine;
    private final Car car;

    public SemaFactory(EngineBehavior engine, Car car) {
        this.engine = engine;
        this.car = car;
    }

    @Override
    public NOS createNOS() {
        return new Sema(engine, car);
    }
}