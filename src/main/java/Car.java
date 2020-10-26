import java.util.Objects;

public class Car {
    private final String name;
    private final String id;
    private final double costPerHour;

    Car(String name, String id, double costPerHour) {
        this.costPerHour = costPerHour;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.costPerHour, costPerHour) == 0 &&
                Objects.equals(name, car.name) &&
                Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, costPerHour);
    }

    public String getName() {
        return this.name;
    }

    public double getCostPerHour() {
        return costPerHour;
    }
}