public class BillGenerator {

    public Bill generate(User user, Car car, double duration) {
        Bill bill = new Bill();
        bill.add(user.getName() + "\t\t" + user.getLicenseNumber() + "\t\t" + car.getName() + "\t\tCost: " + (duration * car.getCostPerHour()));
        return bill;
    }
}
