import java.util.Scanner;

class CircuitRace extends Race {
    public CircuitRace(Car car, Track track) {
        super(car, track);
    }

    @Override
    protected void startCar() {
        System.out.println("Starting Circuit Race with " + super.car.getModel());
    }

    @Override
    protected void startLine() {
        System.out.println("Starting Line at the beginning of the circular track.");
    }

    @Override
    protected void accelerateCar() {
        super.car.accelerate();
    }

    @Override
    protected NOS pitStop(Car car) {
        System.out.println("Pit Stop during Circuit Race.");
        return addNOS(car);
    }

    @Override
    protected void applyNos(NOS nos) {
        if (nos != null) {
            nos.accelerate();
        }
    }

    @Override
    protected void finishLine() {
        System.out.println("Finishing Line at the starting point of the circular track.");
    }

    @Override
    protected void stopCar(NOS nos) {
        super.car.stop();
        if (nos != null) {
            nos.stop();
        }
    }

    private NOS addNOS(Car car) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n");
            System.out.println("Do you want to add NOS? (yes/no)");
            String choice = scanner.next().toLowerCase();
            if ("yes".equals(choice)) {
                NOSFactory nosFactory;
                System.out.println("-------------------");
                System.out.println("| Choose NOS type |\n-------------------\n 1. Resonac\n 2. Sema");
                int nosChoice = scanner.nextInt();
                System.out.println("...............................................");
                System.out.println("\n");
                if (nosChoice == 1) {
                    nosFactory = new ResonacFactory(null, car);
                } else if (nosChoice == 2) {
                    nosFactory = new SemaFactory(null, car);
                } else {
                    throw new IllegalArgumentException("Invalid NOS choice");
                }
                return nosFactory.createNOS();
            } else {
                return null;
            }
        }
    }
}