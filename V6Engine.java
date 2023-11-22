class V6Engine implements EngineBehavior {
    @Override
    public String getEngineType() {
        return "V6";
    }

    @Override
    public void start() {
        System.out.println("V6 Engine started.");
    }

    @Override
    public void stop() {
        System.out.println("V6 Engine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("V6 Engine accelerating.");
    }
}