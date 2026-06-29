class Vehicle {
    String vehicleNumber;

    Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    double fuelCost(int km) {
        return 0;
    }

    void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

// New class added without changing existing classes
class ElectricCar extends Vehicle {

    ElectricCar(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}

public class FleetManagement {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("CAR101"),
                new Bus("BUS201"),
                new Bike("BIKE301"),
                new ElectricCar("EV401")
        };

        int km = 50;

        for (Vehicle v : fleet) {

            v.display();

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Type : Car");
                System.out.println("Fuel Cost = Rs. " + c.fuelCost(km));
            }

            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Type : Bus");
                System.out.println("Fuel Cost = Rs. " + b.fuelCost(km));
            }

            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("Type : Bike");
                System.out.println("Fuel Cost = Rs. " + b.fuelCost(km));
            }

            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("Type : Electric Car");
                System.out.println("Fuel Cost = Rs. " + e.fuelCost(km));
            }

            System.out.println("-------------------------");
        }
    }
}