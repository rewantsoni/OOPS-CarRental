import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Inventory {
    private final List<Car> inventory;

    Inventory() {
        inventory = new ArrayList<>();
    }

    public List<Car> getAll() {
        return inventory;
    }

    public void add(Car car) {
        if (inventory.contains(car)) throw new IllegalArgumentException("Already present");
        inventory.add(car);
    }

    public Car findByName(String carName) {
        for (Car car : inventory) {
            if (car.getName().equals(carName))
                return car;
        }
        throw new NoSuchElementException("No car with this name");
    }
}
