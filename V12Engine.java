class V12Engine implements EngineBehavior {
    @Override
    public String getEngineType() {
        return "V12";
    }

    @Override
    public void start() {
        System.out.println("V12 Engine started.");
    }

    @Override
    public void stop() {
        System.out.println("V12 Engine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("V12 Engine accelerating.");
    }
}