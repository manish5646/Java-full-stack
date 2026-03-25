import java.util.Scanner;

class ReverseNumber
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int rev = 0;

        while(n > 0)
        {
            int digit = n % 10;      // last digit
            rev = rev * 10 + digit; // build reverse
            n = n / 10;             // remove last digit
        }

        System.out.println("reverse = " + rev);
    }
}