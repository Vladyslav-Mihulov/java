import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Vehicle> vehicles;

    public Fleet() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.stream().anyMatch(v -> v.getRegistrationNum().equals(vehicle.getRegistrationNum()))) {
            throw new IllegalArgumentException("Vehicle with the same registration number already exists.");
        }
        vehicles.add(vehicle);
    }

    public void removeVehicle(String registrationNum) {
        boolean removed = vehicles.removeIf(v -> v.getRegistrationNum().equals(registrationNum));
        if (!removed) {
            throw new IllegalArgumentException("No vehicle found with the given registration number.");
        }
    }

    public boolean containsVehicle(String registrationNum) {
        return vehicles.stream().anyMatch(v -> v.getRegistrationNum().equals(registrationNum));
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    public List<Vehicle> getVehiclesByBrand(String brand) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getBrand().equalsIgnoreCase(brand)) {
                result.add(v);
            }
        }
        return result;
    }
}
