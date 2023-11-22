class SprintRaceFactory implements RaceTypeFactory {
    @Override
    public Race createRace(Car car, Track track) {
        return new SprintRace(car, track);
    }
}