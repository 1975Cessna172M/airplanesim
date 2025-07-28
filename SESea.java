public class SESea extends SingleEngineAirplane implements Fly {
    private boolean floats;
    private boolean boat;

    // single engine sea planes can have floats or be a boat type


// getters //
public boolean getFloats() {
    return floats;
}
public boolean getBoat() {
    return boat;
}

// setters //
public void setFloats(boolean floats) {
    this.floats = floats;
}
public void setBoat(boolean boat) {
    this.boat = boat;
}
// constructor
    public SESea(int engines, int wheels, int doors, int wings, String make, String model,
                 boolean retract, boolean floats, boolean boat) {
        super(engines, wheels, doors, wings, make, model, retract);

        // if a plane has no wheels it must have floats
        if (wheels == 0 && !floats) {
            throw new IllegalArgumentException("If there are no wheels, the aircraft must have floats.");
        }
        // if a plane is a boat type it must have wheels
        if (boat && wheels == 0) {
            throw new IllegalArgumentException("A boat-type aircraft must have wheels.");
        }
        this.floats = floats;
        this.boat = boat;
    }


    // override tells us that we're '**overriding**' the methods from super classes and interfaces
    @Override
    public void takeOff() {
        System.out.println(getMake() + " " + getModel() + " is taking off from water.");
    }
    @Override
    public void move() {
        System.out.println(getMake() + " " + getModel() + " is moving on the taxi-way");
    }
    @Override
    public void land() {
        System.out.println(getMake() + " " + getModel() + " is landing on water.");
    }


}
