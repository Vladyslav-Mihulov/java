public class Main {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Car car = new Car("Tesla");
        car.setRegistrationNum("SK2025AK");
        fleet.addVehicle(car);

        Van van = new Van("RAM", 450, 3); // Example with 3 seats
        van.setRegistrationNum("SK2025BK");
        fleet.addVehicle(van);

        System.out.println("All vehicles in fleet:");
        for (Vehicle v : fleet.getAllVehicles()) {
            System.out.println(v.getDescription());
        }

        System.out.println("Vehicles of brand 'Tesla':");
        for (Vehicle v : fleet.getVehiclesByBrand("Tesla")) {
            System.out.println(v.getDescription());
        }

        System.out.println("Removing vehicle 'SK2025AK'.");
        fleet.removeVehicle("SK2025AK");

        System.out.println("Remaining vehicles in fleet:");
        for (Vehicle v : fleet.getAllVehicles()) {
            System.out.println(v.getDescription());
        }
    }
}
