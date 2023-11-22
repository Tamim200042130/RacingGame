class Ferrari812 extends Car {
    public Ferrari812(EngineBehavior engine) {
        super("Ferrari 812", engine);
    }

    @Override
    protected void engineInfo() {
        System.out.println("Engine: " + getEngine().getEngineType());
    }
}