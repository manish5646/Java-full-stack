public class Mobile {

    String name;
    int ram;
    int rom;
    String color;

    // Default Constructor
    public Mobile() {
        this.name = "Unknown";
        this.ram = 0;
        this.rom = 0;
        this.color = "Not specified";
    }

    // Constructor 1
    Mobile(String name) {
        this.name = name;
    }

    // Constructor 2
    Mobile(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    // Constructor 3
    Mobile(String name, int ram, int rom) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
    }

    // Constructor 4
    Mobile(String name, int ram, int rom, String color) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
    }

    // Display method
    public void display() {
        System.out.println("Mobile name: " + name);
        System.out.println("Mobile RAM: " + ram);
        System.out.println("Mobile ROM: " + rom);
        System.out.println("Mobile color: " + color);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.display();

        System.out.println("=======");

        Mobile m2 = new Mobile("Oppo", 4, 128);
        m2.display();

        System.out.println("=======");

        Mobile m3 = new Mobile("Vivo", 8, 256, "White");
        m3.display();
    }
}
