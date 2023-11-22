class PorscheBoxster extends Car {
    public PorscheBoxster(EngineBehavior engine) {
        super("Porsche Boxster", engine);
    }

    @Override
    protected void engineInfo() {
        System.out.println("Engine: " + getEngine().getEngineType());
    }
}