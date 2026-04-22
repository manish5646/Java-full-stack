class A {
static {
System.out.println("static-block-A");
}
}
class B extends A{
static int i=10;
static {
System.out.println("static-block-B");
}
}
public static void main(String[]args){
System.out.println(B.i);//ststic-blok-A
  //ststic-block-B
}

