class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        // Upcasting
        Animal a = new Dog();  

        // Downcasting
        Dog d = (Dog) a;  

        d.sound();  // Parent method
        d.bark();   // Child method
    }
}
