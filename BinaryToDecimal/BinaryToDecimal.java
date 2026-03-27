import java.util.Scanner;
class BinaryToDecimal
{
public static void main(String[]args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a binarynumber");

int bin=scn.nextInt();
int res=0;
int i=1;
while (bin>0){
res+=(bin%10)*i;
i*=2;
bin/=10;
}
System.out.println(res);
}
}

