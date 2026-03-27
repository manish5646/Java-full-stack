import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = a < b ? a : b;

        while (n > 0) {
            if ((a % n == 0) && (b % n == 0)) {
                System.out.println("HCF = " + n);
                break;
            }
            n--;
        }
    }
}
