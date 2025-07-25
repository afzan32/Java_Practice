interface Car{
    void start();
    default void stop(){
        System.out.println("Car hass been stopped");
    }
}



public class LambdaExpression {
    public static void main(String[] args) {
        
        // Car myCar = new Car(){
        //     @Override
        //    public void start(){
        //         System.out.println("This is car");
        //     }
        // };
         Car myCar = () ->{
           
                System.out.println("This is car");
           
        };

myCar.start();

     
    }
     
}
