import java.util.List;

public class RentalEngine {
    private final Inventory inventory;
    private final Store store;
    private final BillGenerator billGenerator;

    RentalEngine(Inventory inventory, Store store, BillGenerator billGenerator) {
        this.inventory = inventory;
        this.store = store;
        this.billGenerator = billGenerator;
    }

    List<Car> ListInventory() {
        return inventory.getAll();
    }

    Car rent(User user, String carName) {
        Car car = inventory.findByName(carName);
        store.add(user, car);
        return car;
    }

    Bill park(User user, Car car) {
        int duration = (int) (Math.random() * 100);
        store.remove(user, car);
        return billGenerator.generate(user, car, duration);
    }
}
