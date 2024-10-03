public class Motor extends Vehicle {
    private int engineSize;

    public Motor(String make, String model, int year, double rentalPrice, int engineSize) {
        super(make, model, year, rentalPrice); // Call the parent constructor
        this.engineSize = engineSize;
    }

    //Setter for engineSize
    public int getEngineSize(){
        return engineSize;
    }


}
