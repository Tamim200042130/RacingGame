class Track {
    private String name;

    public Track(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void trackInfo() {
        System.out.println("Track: " + name);
    }
}