// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // inherited from Animal
        myDog.bark(); // specific to Dog
    }
}
