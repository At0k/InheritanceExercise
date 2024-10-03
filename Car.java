public class Car extends Vehicle {
    private int numSeat;
    private int numDoors;
    
    public Car(String make, String model, int year, double rentalPrice, int numSeat, int numDoors) {
        super(make, model, year, rentalPrice); // Call the parent constructor
        this.numSeat = numSeat;
        this.numDoors = numDoors;
    }

    //Getter and Setter numSeat
    public int getNumSeat(){
        return numSeat;
    }

    public int getNumDoors(){
        return numDoors;
    }



}
