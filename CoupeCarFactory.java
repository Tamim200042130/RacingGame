public class CoupeCarFactory implements CarFactory {
    @Override
    public Car createCar(EngineBehavior engine, boolean addTurbocharger) {
        Car car = new ToyotaGR86(engine); // Default choice for Coupe
       
        return car;
    }
}
