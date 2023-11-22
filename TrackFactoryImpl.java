class TrackFactoryImpl implements TrackFactory {
    @Override
    public Track createTrack(String name) {
        return new Track(name);
    }
}