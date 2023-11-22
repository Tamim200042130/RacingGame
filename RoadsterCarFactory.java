public class RoadsterCarFactory implements CarFactory {
    @Override
    public Car createCar(EngineBehavior engine, boolean addTurbocharger) {
        Car car = new PorscheBoxster(engine); 
        return car;
    }
}
