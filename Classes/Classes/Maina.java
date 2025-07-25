package Classes;

public class Maina {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.name="ferrari";
        obj.speed=120;
        obj.value= 345;

        van objvan= new van();
        objvan.color="green";


       obj.carname();
       obj.carspeed();
       obj.carvalue();
       objvan.vancolor();

        
    }
}
