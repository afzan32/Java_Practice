class car{
    public void drive() {
        System.out.println("The car is driving.");
    }
}



public class AnonymousClass {
    public static void main(String[] args) {
        car myCar = new car() 
        {
    @Override
    public void drive() {
        System.out.println("The car is driving fast.");
    }
};
    myCar.drive();
    car anotherCar = new car() ;
        anotherCar.drive();
    
}
}
