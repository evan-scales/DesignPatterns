/**
 * Small car class
 * @author Evan Scales
 */
public class SmallCar extends Car {

    /**
     * Constructor method for the small car object
     * @param make String make of the car
     * @param model String model of the car
     */
    SmallCar(String make, String model) {
        super(make, model);
        assemble();
    }

    /**
     * Abstract class to add a certain frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    /**
     * Abstract class to add accessories to the car
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
