class CircuitRaceFactory implements RaceTypeFactory {
    @Override
    public Race createRace(Car car, Track track) {
        return new CircuitRace(car, track);
    }
}