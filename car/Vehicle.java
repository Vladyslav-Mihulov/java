abstract class Vehicle {
    protected final String brand;
    protected String registrationNum;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public abstract String getDescription();

    public abstract int getSeatCount();
}
