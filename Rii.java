import java.util.Scanner;

public class Rii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n \n");
        System.out.println("********************************************");
        System.out.println("* Welcome to the Single-Player Racing Game *");
        System.out.println("********************************************");
        System.out.println("\n");
        CarFactory carFactory = new CoupeCarFactory();
        TrackFactory trackFactory = new TrackFactoryImpl();

        System.out.println("----------------");
        System.out.println("| Choose a car |");
        System.out.println("----------------");
        System.out.println("1. ToyotaGR86");
        System.out.println("2. SubaruBRZ");
        System.out.println("3. PorscheBoxster");
        System.out.println("4. Ferrari812");
        int carChoice = scanner.nextInt();
        System.out.println("...............................................");
        System.out.println("\n");

        Car chosenCar;

        if (carChoice == 4) {

            carFactory = new RoadsterCarFactory();
        }
        System.out.println("-------------------------");
        System.out.println("| Choose an engine type |");
        System.out.println("-------------------------");
        System.out.println("1. V6 Engine");
        System.out.println("2. V8 Engine");
        System.out.println("3. V12 Engine");
        int engineChoice = scanner.nextInt();
        System.out.println("...............................................");
        System.out.println("\n");

        EngineBehavior chosenEngine;
        switch (engineChoice) {
            case 1:
                chosenEngine = new V6Engine();
                break;
            case 2:
                chosenEngine = new V8Engine();
                break;
            case 3:
                chosenEngine = new V12Engine();
                break;
            default:
                throw new IllegalArgumentException("Invalid engine choice");
        }
        System.out.println("Do you want to add a turbocharger? (yes/no)");
        String turboChoice = scanner.next().toLowerCase();
        boolean addTurbocharger = "yes".equals(turboChoice);
        chosenCar = carFactory.createCar(chosenEngine, addTurbocharger);
        if (addTurbocharger) {
            System.out.println("-------------------------------");
            System.out.println("| Choose a turbocharger type: |");
            System.out.println("-------------------------------");
            System.out.println("1. Alpine");
            System.out.println("2. Cummins");
            System.out.println("3. Honeywell");
            int turbochargerChoice = scanner.nextInt();
            System.out.println("...............................................");
            System.out.println("\n");
            switch (turbochargerChoice) {
                case 1:
                    chosenCar = new AlpineTurbocharger(chosenCar);
                    break;
                case 2:
                    chosenCar = new CumminsTurbocharger(chosenCar);
                    break;
                case 3:
                    chosenCar = new HoneywellTurbocharger(chosenCar);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid turbocharger choice");
            }
        }

        System.out.println("------------------");
        System.out.println("| Choose a track |");
        System.out.println("------------------");
        System.out.println("1. Blue Moon Bay Speedway (USA)");
        System.out.println("2. BB Raceway (Japan)");
        System.out.println("3. Circuit de Spa-Francorchamps (Germany)");
        int trackChoice = scanner.nextInt();
        System.out.println("...............................................");
        System.out.println("\n");
        String trackName = "";
        switch (trackChoice) {
            case 1:
                trackName = "Blue Moon Bay Speedway (USA)";
                break;
            case 2:
                trackName = "BB Raceway (Japan)";
                break;
            case 3:
                trackName = "Circuit de Spa-Francorchamps (Germany)";
                break;
            default:
                throw new IllegalArgumentException("Invalid track choice");
        }

        Track chosenTrack = trackFactory.createTrack(trackName);

        System.out.println("Selected Track: " + trackName);

        System.out.println("----------------------");
        System.out.println("| Choose a race type |");
        System.out.println("----------------------");
        System.out.println("1. Sprint Race");
        System.out.println("2. Circuit Race");
        int raceType = scanner.nextInt();
        System.out.println("...............................................");
        System.out.println("\n");

        RaceTypeFactory raceTypeFactory;
        if (raceType == 1) {
            raceTypeFactory = new SprintRaceFactory();
        } else if (raceType == 2) {
            raceTypeFactory = new CircuitRaceFactory();
        } else {
            throw new IllegalArgumentException("Invalid race type");
        }

        Race race = raceTypeFactory.createRace(chosenCar, chosenTrack);
        race.race();

        scanner.close();
    }
}
