class SubaruBRZ extends Car {
    public SubaruBRZ(EngineBehavior engine) {
        super("Subaru BRZ", engine);
    }

    @Override
    protected void engineInfo() {
        System.out.println("Engine: " + getEngine().getEngineType());
    }
}