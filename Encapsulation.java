class Encapsulation{

    private int age;
    private String na;
void setAge(int age){
    this.age=age;
}
int getAge(){
    return age;
}
    void setName(String name ){
        this.na=name;

    }
    String getName(){
        return na;
    }
    public static void main(String[] args) {
        Encapsulation obj =new Encapsulation();
        obj.setName("afzan");
        System.out.println(obj.getName());

        obj.setAge(10);
        System.out.println(obj.getAge());
    }
}

