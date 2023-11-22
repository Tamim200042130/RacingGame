class SprintRace extends Race {
    public SprintRace(Car car, Track track) {
        super(car, track);
    }

    @Override
    protected void startCar() {
        System.out.println("Starting Sprint Race with " + super.car.getModel());
    }

    @Override
    protected void startLine() {
        System.out.println("Starting Line at the beginning of the track.");
    }

    @Override
    protected void accelerateCar() {
        super.car.accelerate();
    }

    @Override
    protected NOS pitStop(Car car) {
        System.out.println("Pit Stop during Sprint Race.");
        return null;
    }

    @Override
    protected void applyNos(NOS nos) {

    }

    @Override
    protected void finishLine() {
        System.out.println("Finishing Line at the end of the track.");
    }

    @Override
    protected void stopCar(NOS nos) {
        super.car.stop();
    }
}