/**
 * CarFactory
 * @author Evan Scales
 */
public class CarFactory {

    /**
     * Create a car and returns that car
     * @param type String the type of that car
     * @param make Strng the make of that car
     * @param model String the model of that car
     * @return Car a car
     */
    public static Car createCar(String type, String make, String model) {
        Car ret;
        
        if (type.equalsIgnoreCase("small")) {
            ret = new SmallCar(make, model);
        } else if (type.equalsIgnoreCase("sedan")) {
            ret = new SedanCar(make, model);
        } else if (type.equalsIgnoreCase("luxury")) {
            ret = new LuxuryCar(make, model);
        } else {
            ret = null;
        }

        return ret;
    }
}