public class Mobile {
    String name;
    int ram;
    int rom;
    String color;

    Mobile(String name, int ram, int rom, String color) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
    }

    public void display() {
        System.out.println(name + "\n" + ram + "\n" + rom + "\n" + color);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("oppo", 4, 128, "Black");
        m1.display();
    }
}
