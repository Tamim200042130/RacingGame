class ResonacFactory implements NOSFactory {
    private final EngineBehavior engine;
    private final Car car;

    public ResonacFactory(EngineBehavior engine, Car car) {
        this.engine = engine;
        this.car = car;
    }

    @Override
    public NOS createNOS() {
        return new Resonac(engine, car);
    }
}