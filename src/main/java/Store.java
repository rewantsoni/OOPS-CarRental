import java.util.HashMap;
import java.util.Map;

public class Store {
    private final Map<User, Car> assignedCarStore;

    Store() {
        assignedCarStore = new HashMap<>();
    }

    public void add(User user, Car car) {
        if (assignedCarStore.containsKey(user)) throw new UnsupportedOperationException("User already has a Car");
        if (assignedCarStore.containsValue(car)) throw new UnsupportedOperationException("Car is already rented");
        assignedCarStore.put(user, car);
    }

    public void remove(User user, Car car) {
        if (!assignedCarStore.containsKey(user)) throw new UnsupportedOperationException("User doesn't have a Car");
        if (!assignedCarStore.containsValue(car)) throw new UnsupportedOperationException("This car is not rented");
        if (!assignedCarStore.remove(user, car)) throw new UnsupportedOperationException("User doesn't own this car");
    }
}
