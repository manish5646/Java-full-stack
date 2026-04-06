class C
{
static int add(int...num)
{
int sum=0;
for (int n:num){
   sum+=n;
}
return sum;
}
public static void main(String[]args)
{
System.out.println(add(3,5,7,8,9));
System.out.println(add(20,30));
}
}
