public class SELand extends SingleEngineAirplane implements Fly {
    private boolean tailWheel;
    private boolean tricycle;
// single engine land planes must be either tailwheel or tricycle

    //setters
    public void setTailWheel(boolean tailWheel){
        this.tailWheel = tailWheel;
    }
    public void setTricycle(boolean tricycle){
        this.tricycle = tricycle;
    }

    // getters
    public boolean getTailWheel(){
        return this.tailWheel;
    }
    public boolean getTricycle(){
        return this.tricycle;
    }

//constructors
    public SELand(int engines, int wheels, int doors, int wings, String make, String model, boolean retract,
                  boolean tailWheel, boolean tricycle) {
        super(engines, wheels, doors, wings, make, model, retract);
        this.tailWheel = tailWheel;
        this.tricycle = tricycle;
        if(tailWheel && tricycle){
            System.out.println("Vehicle cannot be both Tail Wheel and Tricycle");

            // cant both be true, must pick one
        }
    }

    // override tells us that we're '**overriding**' the methods from super classes and interfaces
    @Override
    public void takeOff() {
        System.out.println(getMake() + " " + getModel() + " is taking off on land.");
    }
    @Override
    public void move() {
        System.out.println(getMake() + " " + getModel() + " is moving on the taxi-way.");
        }
    @Override
    public void land(){
        System.out.println(getMake()+ " " + getModel() + " is landing on land.");
    }


}
