public class Runner {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.add(new Car("carOne", "one", 100));
        inventory.add(new Car("carThree", "three", 90));
        inventory.add(new Car("carTwo", "three", 30));
        Store store = new Store();
        BillGenerator billGenerator = new BillGenerator();

        RentalEngine rentalEngine = new RentalEngine(inventory, store, billGenerator);

        User user = new User("one", "13JN10931");
        User userTwo = new User("oneTwo", "13JN18931");

        System.out.println(rentalEngine.ListInventory());
        try {
            Car car =rentalEngine.rent(user, "carOne");
            Car carTwo =rentalEngine.rent(userTwo, "carTwo");
            System.out.println(rentalEngine.park(userTwo,carTwo).generate());
            System.out.println(rentalEngine.park(user,car).generate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
