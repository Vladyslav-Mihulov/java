public class Car extends Vehicle {
    private int seatCount;

    public Car(String brand) {
        super(brand);
        this.seatCount = 5;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String getDescription() {
        return registrationNum + "\nMarka: " + brand + "\nTyp: osobowy\nLiczba miejsc: " + seatCount;
    }
}
