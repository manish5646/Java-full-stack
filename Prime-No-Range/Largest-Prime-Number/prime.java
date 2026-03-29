import java.util.Scanner;

class LargestPrime {
    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i >= 2; i--) {

            boolean flag = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Largest prime is: " + i);
                break;
            }
        }
    }
}
