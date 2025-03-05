public class Van extends Vehicle {
    private int vanLength;
    private int seatCount;

    public Van(String brand) {
        this(brand, 250, 2); // Default 2 seats for Van
    }

    public Van(String brand, int cargoLength) {
        this(brand, cargoLength, 2); // Default 2 seats for Van
    }

    public Van(String brand, int cargoLength, int seatCount) {
        super(brand);
        this.vanLength = cargoLength;
        this.seatCount = seatCount;
    }

    public int getVanLength() {
        return vanLength;
    }

    public void setVanLength(int cargoLength) {
        this.vanLength = cargoLength;
    }

    @Override
    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String getDescription() {
        return registrationNum + "\nMarka: " + brand + "\nTyp: dostawczy\nLiczba miejsc: " + seatCount + "\nDlugosc: " + vanLength + " cm";
    }
}
