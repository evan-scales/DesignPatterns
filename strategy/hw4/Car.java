/**
 * Abstract class for the car object
 * @author Evan Scales
 */
import java.util.ArrayList;
public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories;

    /**
     * Constructor method for the car object
     * @param make String make of the car
     * @param model String model of the car
     */
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        accessories = new ArrayList<Accessories>();
        System.out.println("Creating a " + make + " " + model);
    }

    /**
     * Adds everything to the car then 
     * displays accesories
     */
    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * Add frame to the car
     */
    protected abstract void addFrame();

    /**
     * Add wheels to the car
     */
    protected void addWheels() {
        System.out.println("Adding the wheels");
    }

    /**
     * Add an anengine to the car
     */
    protected void addEngine() {
        System.out.println("Adding a standard engine");
    }

    /**
     * Add windows to the car
     */
    protected void addWindows() {
        System.out.println("Adding windows");
    }

    /**
     * Add accessories to the car
     */
    protected abstract void addAccessories();

    /**
     * Display the accessories of the car
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        for (Accessories a : accessories) {
            System.out.println("- " + a);
        }
    }
}
