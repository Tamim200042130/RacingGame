import java.text.SimpleDateFormat;
import java.util.Random;

abstract class Race {
    protected Car car;
    private Track track;

    public Race(Car car, Track track) {
        this.car = car;
        this.track = track;
    }

    public final void race() {
        car.carInfo();
        track.trackInfo();
        startCar();
        startLine();
        accelerateCar();
        NOS nos = pitStop(car);
        applyNos(nos);
        finishLine();
        stopCar(nos);
        lapTime();
    }

    protected abstract void startCar();

    protected abstract void startLine();

    protected abstract void accelerateCar();

    protected abstract NOS pitStop(Car car);

    protected abstract void applyNos(NOS nos);

    protected abstract void finishLine();

    protected abstract void stopCar(NOS nos);

    protected void lapTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Random random = new Random();
        long timeInMillis = random.nextInt(3600000);
        String formattedTime = sdf.format(timeInMillis);
        System.out.println("Lap Time: " + formattedTime);
    }
}