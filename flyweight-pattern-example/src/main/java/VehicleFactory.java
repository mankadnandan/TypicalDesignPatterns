import java.util.HashMap;

/**
 * Created by Nandan Mankad on 15-01-21.
 */
public class VehicleFactory {
    HashMap<Integer, Vehicle> vehicleHashMap = new HashMap<>();

    public Vehicle get(int type) {
        if (vehicleHashMap.containsKey(type)) {
            return vehicleHashMap.get(type);
        } else {
            Vehicle vehicle;
            if (type == 0) {
                vehicle = new Car();
            } else {
                vehicle = new Truck();
            }
            vehicleHashMap.put(type, vehicle);
            return vehicle;
        }
    }

}
