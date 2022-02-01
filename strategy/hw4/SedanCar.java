/**
 * Sedan car class
 * @author Evan Scales
 */
public class SedanCar extends Car {

    /**
     * Constructor method for the seda car object
     * @param make String make of the car
     * @param model String model of the car
     */
    SedanCar(String make, String model) {
        super(make, model);
        assemble();
    }

    /**
     * Abstract class to add a certain frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    /**
     * Abstract class to add accessories to the car
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}
