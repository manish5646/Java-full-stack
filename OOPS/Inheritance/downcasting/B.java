class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting

        Dog d = (Dog) a;        // Downcasting
        d.sound();
        d.bark();
    }
}
