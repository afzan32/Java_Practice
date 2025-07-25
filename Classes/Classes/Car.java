package Classes;
 
public class Car {
    int speed;
    int value;
    String name;
    String color;

     void carspeed(){
        System.out.println("car speed is" +speed);
    }
    
     void carvalue(){
        System.out.println("car value is "+ value);
    }

    void carname(){
        System.out.println("car name is "+ name);
    }
}

//for inheritance 
class van extends Car{

    void vancolor(){
        System.out.println("van color is "+ color);
    }
} 