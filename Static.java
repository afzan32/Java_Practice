public class Static {
    String name ;

    static void car(String name){
        System.out.println(name);
    }


    public static void main(String[] args) {
        Static carobj = new Static();
carobj.name="ferrari";
            car(carobj.name);
       
    }
}