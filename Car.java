abstract class Car {
    private EngineBehavior engine;
    private String model;

    public Car(String model, EngineBehavior engine) {
        this.model = model;
        this.engine = engine;
    }

    public void carInfo() {

        engineInfo();
    }

    public String getModel() {
        return this.model;

    }

    public EngineBehavior getEngine() {
        return engine;
    }

    protected abstract void engineInfo();

    public void start() {
        System.out.println("Car started.");
        engine.start();
    }

    public void stop() {
        System.out.println("Car stopped.");
        engine.stop();
    }

    public void accelerate() {
        System.out.println("Car accelerating.");
        engine.accelerate();
    }
}