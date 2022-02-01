/**
 * Luxury car class
 * @author Evan Scales
 */
public class LuxuryCar extends Car {

    /**
     * Constructor method for the luxury car object
     * @param make String make of the car
     * @param model String model of the car
     */
    LuxuryCar(String make, String model) {
        super(make, model);
        assemble();
    }

    /**
     * Abstract class to add a certain frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Adds a new fancy engine to the car
     */
    @Override
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
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
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
    }
}
