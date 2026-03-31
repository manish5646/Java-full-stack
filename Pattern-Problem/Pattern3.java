import java.util.Scanner;

class Pattern3
{
    public static void main(String[] args)
    {
        System.out.print("Enter a value: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == (n+1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 
        }
    }
}
