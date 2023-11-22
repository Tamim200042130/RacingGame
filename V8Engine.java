class V8Engine implements EngineBehavior {

    @Override
    public String getEngineType() {
        return "V8";
    }
    @Override
    public void start() {
        System.out.println("V8 Engine started.");
    }

    @Override
    public void stop() {
        System.out.println("V8 Engine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("V8 Engine accelerating.");
    }
}