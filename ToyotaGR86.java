class ToyotaGR86 extends Car {
    public ToyotaGR86(EngineBehavior engine) {
        super("Toyota GR86", engine);
    }

    @Override
    protected void engineInfo() {
        System.out.println("Engine: " + getEngine().getEngineType());
    }
    
}