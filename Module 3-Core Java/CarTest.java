class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Tata", "Nano", 2012);
        Car car2 = new Car("Mahindra", "Suv", 2014);

        car1.displayDetails();
        car2.displayDetails();
    }
}
