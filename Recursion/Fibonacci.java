class Fibonacci
{
public static void main(String[]args)
{
display(0,1,15);
}
static void display(int a,int b,int count){
 if (count==0) return;
System.out.println(a);
display (b,a+b, count-1);
}
}
