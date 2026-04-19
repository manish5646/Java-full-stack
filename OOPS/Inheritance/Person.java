class Person {
    Person() {
        System.out.println("Person created");
    }
}

class Student extends Person {
    Student() {
        System.out.println("Student created");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
