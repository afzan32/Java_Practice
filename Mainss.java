// File: Mainss.java

class Car {
  public void drive() {
    System.out.println("car is running");
  }
}

class Bike {
  public void drive() {
    System.out.println("Bike is running");
  }
}

// The public class name must match the file name.
public class Mainss {
  public static void main(String[] args) {
    // You can create objects of the other classes defined in the same file.
    Car myCar = new Car();
    myCar.drive();
    
    Bike myBike = new Bike();
    myBike.drive();
  }
}