public class RentalMain {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car car = new Car("Toyota", "Camry", 2020, 50.0, 5, 4);
        Motor motor = new Motor("Honda", "CBR", 2019, 30.0, 1000); // Correct variable name is 'motor'
  
        int days = 5;
        
        // Calculate rental costs
        double carRentalCost = car.calculateRentalCost(days);
        double motorRentalCost = motor.calculateRentalCost(days);
  
        // Print details for Car
        System.out.println("Car Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Seats: " + car.getNumSeat());
        System.out.println("Doors: " + car.getNumDoors());
        System.out.println("Rental Price Per Day: $" + car.getRentalPrice());
        System.out.println("Total Rental Cost for " + days + " days: $" + carRentalCost);
  
        // Print details for Motorcycle
        System.out.println("\nMotorcycle Details:");
        System.out.println("Make: " + motor.getMake());
        System.out.println("Model: " + motor.getModel());
        System.out.println("Year: " + motor.getYear());
        System.out.println("Engine Size: " + motor.getEngineSize() + "cc");
        System.out.println("Rental Price Per Day: $" + motor.getRentalPrice());
        System.out.println("Total Rental Cost for " + days + " days: $" + motorRentalCost);
    }
  }
  