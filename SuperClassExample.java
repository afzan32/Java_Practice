class Car {
    void start() {
        System.out.println("Car has been started");
    }
}

class Bike extends Car {
    @Override
    void start() {
        super.start();
        System.out.println("Bike has been started");
    }

    void end() {
        System.out.println("Bike has been stopped");
    }
}

public class SuperClassExample {
    public static void main(String[] args) {
        Bike myCar = new Bike();
        myCar.start();
        myCar.end();

    }
}
