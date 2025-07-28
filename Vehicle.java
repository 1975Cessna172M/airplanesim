public abstract class Vehicle {

    // Abstract aircraft class, cannot be created as an object, merely outlines what all other objeects MUST have

private int engines;
private int wheels;
private int doors;
private int wings;
private String make;
private String model;

// CONSTRUCTOR //
protected Vehicle(int engines, int wheels, int doors, int wings, String make, String model) {
    this.engines = engines;
    this.wheels = wheels;
    this.doors = doors;
    this.wings = wings;
    this.make = make;
    this.model = model;
}
// GETTERS //
 public int getEngines() {
    return engines;
 }
 public int getWheels() {
    return wheels;
 }
 public int getDoors() {
    return doors;
 }
 public int getWings() {
    return wings;
 }
 public String getMake() {
    return make;
 }
 public String getModel() {
    return model;
 }

 // SETTERS //
 public void setEngines(int engines) {
    this.engines = engines;
 }
 public void setWheels(int wheels) {
    this.wheels = wheels;
 }
 public void setDoors(int doors) {
    this.doors = doors;
 }
 public void setWings(int wings) {
    this.wings = wings;
 }
 public void setMake(String make) {
     this.make = make;
 }
 public void setModel(String model) {
    this.model = model;
 }

 // METHODS //
    // concrete
public void startEngine(){
    System.out.println("\nThe " + getModel() + " Has started its engine.");
}
public void stopEngine() {
    System.out.println(getModel() + " has stopped its engine.");
    if (getModel().equals("172M")) {
        System.out.println("The best and brightest\n");
    }
}

    // abstract to show what all vehicles should do
public abstract void move();
}

