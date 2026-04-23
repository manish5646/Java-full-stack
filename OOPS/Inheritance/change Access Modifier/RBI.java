Class RBI{
  int reteofint(){
    return 0;
  }
}
Class SBI extends RBI {
  @override
    public int rateofint(){
    return 10;
  }
}
Class ICICI extends RBI {
  @override
    int rateofint(){
    return 11;
  }
}
Class Axis extends RBI {
  @override
    protected int rateofint(){
    return 9;
  }
  }
public class BankDriver{
  public static void main(String[]args);
  {
    SBI s=new SBI();
    ICICI i=new ICICI();
    Axis a=new Axis();
    System.out.println("SBI Bank rateofint is:" + S.rateofInt());
    System.out.println("ICICI Bank rateofint is:" + i.rateofInt
    System.out.println("Axis Bank rateofint is:" + a.rateofInt());
  }
}
