Class Card{
  String name;
 long name;
  int cvv;
  string exp;
}
class Credit card extends Card{
  long limit;
  public void display(){
    System.out.println("Card Name:"+name);
    System.out.println("Card num:"+num);
    System.out.println("Card CVV:"+CVV);
    System.out.println("Card exp:"+exp);
    System.out.println("Card limit:"limit);
  }
}
Class DebitCard extends Card{
   int bal;
}
public class card driver {
  public static void main(String[]args){
    Credit card c=new Creditcard();
    c.name="visa";
    c.num="23456767859";
    c.cvv="121329";
    c.exp="12/29";
    c.limit= 100000;
    c.display();
  }
}
    
