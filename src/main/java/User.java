import java.util.Objects;

public class User {
    private final String name;
    private final String licenseNumber;

    User(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(licenseNumber, user.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licenseNumber);
    }
}
