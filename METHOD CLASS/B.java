class B
{
static void m1(int...a)
{
for (int n:a){
System.out.print(n+ " ");
}
System.out.println();
}
public static void main(String[]args)
{
m1(3);
m1(3,6,8,9);
}
}
