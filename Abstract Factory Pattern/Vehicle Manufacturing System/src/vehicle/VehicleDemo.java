package vehicle;

public class VehicleDemo {

    public static void main(String[] args) {

        VehicleFactory factory;

        String vehicleType = "electric"; // change to "petrol"

        if (vehicleType.equalsIgnoreCase("electric")) {
            factory = new ElectricVehicleFactory();
        } else {
            factory = new PetrolVehicleFactory();
        }

        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.manufacture();
        bike.manufacture();
    }
}