public class Vehicle {
  String make;
  String model;
  int year;
  double rentalPrice;


  public Vehicle(String make, String model, int year, double rentalPrice) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.rentalPrice = rentalPrice;
}

  public String getMake(){
    return make;
  }

  public String getModel(){
    return model;
  }

  public int getYear(){
    return year;
  }

  public double getRentalPrice(){
    return rentalPrice;
  }

  public double calculateRentalCost(int days){
    return days * rentalPrice;
  }

}
