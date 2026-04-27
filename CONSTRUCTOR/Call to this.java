public class Student {

    String name;
    int age;
    int id;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.id = 0;
    }

    // Constructor 1
    Student(String name) {
        this.name = name;
    }

    // Constructor 2
    Student(String name, int age) {
        this(name);  // constructor chaining
        this.age = age;
    }

    // Constructor 3
    Student(String name, int age, int id) {
        this(name, age);  // constructor chaining
        this.id = id;
    }

    // Display method
    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student id: " + id);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Avyak", 24, 243);
        s1.display();
    }
}
