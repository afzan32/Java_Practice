class car extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("car is going");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.addSuppressed(e);
            }
    }
}}

class bike extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10;i++){
  System.out.println("bike is going");
   try {
          Thread.sleep(2);
      } catch (InterruptedException e) {
        e.addSuppressed(e);
      }
        }
     
    }
}

public class Thread_sample {
    public static void main(String[] args) {
        car mycar = new car();
        bike mybike = new bike();
        mybike.setPriority(10);
        mycar.start();
         mybike.start();
        
        try {
             mycar.join();
        } catch (Exception e) {
        }
       
       
        System.out.println("Hi afzan");
    }
}