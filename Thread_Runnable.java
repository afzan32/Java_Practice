class Car implements Runnable{
    @Override
    public void run(){
        System.out.println("hELLOOO");
    }
}

public class Thread_Runnable {
    public static void main(String[] args) {
        Runnable mycar = new Car();
        Thread newthread= new Thread(mycar);
        newthread.start();
       // newthread.(mycar);
        //mycar.start();
    }
    
}
