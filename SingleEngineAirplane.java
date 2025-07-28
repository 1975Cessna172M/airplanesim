public class SingleEngineAirplane extends Vehicle{
    private boolean retract;

    // single engine airplanes might be retract

    // getter
    public boolean getRetract() {
        return retract;
    }

    //setter
    public void setRetract(boolean retract) {
        this.retract = retract;
    }

    //Constructor
    public SingleEngineAirplane(int engines, int wheels, int doors, int wings, String make, String model, boolean retract) {
        super(engines, wheels, doors, wings, make, model);
        if (engines > 1) {
            throw new IllegalArgumentException("SingleEngineAirplane aircraft cannot have more than one engine.");
        }
        this.retract = retract;
        }




    @Override
    public void move() {
        System.out.println("generic is taking off.");
    }

}

