import java.util.Random;

public class MainFlightSim {
    public static void main(String[] args) {
        // make objects
        Vehicle C172 = new SELand(1, 3, 2, 2, "Cessna", "172M", false, false, true);
        Vehicle PA181 = new SELand(1, 3, 1, 2, "Piper", "PA-28-181", false, false, true);
        Vehicle PA200 = new SELand(1, 3, 1, 2, "Pipper", "PA-28R-2000", true, false, true);
        Vehicle C185 = new SELand(1, 3, 2, 2, "Cessna", "185M", false, true, false); // fixed tailwheel/tricycle

        Vehicle Petrel = new SESea(1, 3, 2, 4, "Scoda", "Super Petrel", true, false, true);
        Vehicle A1C = new SESea(1, 4, 1, 2, "Aviat", "Husky A-1-C", true, true, false);
        Vehicle C150onFLoats = new SESea(1, 0, 2, 2, "Cessna", "C150", false, true, false);
        Vehicle Generic = new SingleEngineAirplane(1,1,1,1,"Generic","generic",false);

        System.out.println("\n // ----- It's a busy day at the airport ----- // ");
// fly objects
        flyAircraft(Petrel);
        flyAircraft(Generic);
        flyAircraft(C185);
        flyAircraft(C150onFLoats);
        flyAircraft(A1C);
        flyAircraft(PA181);
        flyAircraft(C172);
        flyAircraft(PA200);

    }

    private static void flyAircraft(Vehicle aircraft) {
 // fly aircraft method
        System.out.println("\n ----Another pilot is going up----");
        aircraft.startEngine();
        aircraft.move();
        if (!(aircraft instanceof Fly flyable)) {

            System.out.println("\n*** " +  aircraft.getMake() + " " + aircraft.getModel() +
                    " cannot fly. Skipping flight ***\n");
            // check if it uses the interface
            // fail flight if not
            return;
        }

        Random rand = new Random();

        System.out.println("\n--I wonder if this one will crash?-- \n");

       flyable.takeOff();

        if (rand.nextInt(10) == 0) {
            System.out.println("\n||||||| ---- There's been a crash! ---- |||||||\n");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠤⢒⣦⠶⠶⠶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢀⡴⠋⠿⠀⠀⠈⠋⠀⠀⠀⠁⠙⠷⣦⣤⣀⠀⠀⠀⠀⠀\n" +
                    "⠀⢀⡴⠶⣴⠻⠀⠀⠐⣶⠞⠁⠀⢀⠀⠀⠀⣀⠀⠙⠀⠹⢶⣀⠀⠀⠀\n" +
                    "⢠⡿⠀⠀⠗⠀⠀⠀⠀⠃⠀⠀⢰⣏⠁⠀⠀⠈⡏⠉⠀⠀⠸⡏⢣⠀⠀\n" +
                    "⣺⠂⠀⣖⠀⠀⠀⠀⢀⡀⢀⣹⣦⡽⣦⣴⣤⣀⢠⡀⠀⢀⠀⠑⠼⣇⠀\n" +
                    "⠹⡟⡄⢈⣩⠀⠀⠲⠾⠛⡛⠋⠉⠀⡀⢀⣿⠙⠾⣦⡐⢿⡁⠀⡀⢸⡀\n" +
                    "⠀⢿⣷⡀⠀⢚⡀⠈⢉⡳⢵⡄⢠⠀⠇⣿⣿⠒⠚⠍⠁⢀⣤⡰⠛⠛⠁\n" +
                    "⠀⠀⠈⠛⠛⠋⠈⠉⠉⠙⠓⣷⠸⣼⣸⢻⣛⠓⠶⠞⠓⠛⠉⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⣠⡴⣞⣭⣿⡄⠋⡇⢸⢥⡽⢳⣤⡀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠐⣯⡁⣉⠛⢏⣸⣇⣷⣉⣿⡴⢧⠈⠊⠹⣧⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠙⠶⣷⣆⣀⣌⠁⠘⣁⣨⡀⢈⣀⣰⣠⣿⠇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⣿⣷⠛⡋⣏⠙⠿⠛⠉⠉⠁⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢻⠀⡇⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⢸⠃⡇⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⡀⣴⣿⠟⠀⠀⣷⠈⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠐⠋⠁⠠⠃⠀⠈⠀⠈⠙⠂⠀⠀⠀⠀⠀⠀⠀⠀\n");
            aircraft.stopEngine();
            System.out.println(aircraft.getMake() + " " + aircraft.getModel() +
                    " has just exploded. \nThere are no survivors!");
            return;
            // ~1 in 10 flights blow up
        }

        flyable.land();
        aircraft.stopEngine();
    }
}
