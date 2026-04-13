import java.util.Scanner;

class SumOfNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
