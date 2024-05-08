abstract class Bank
{
    abstract void ATM();
    abstract void KYC();
}

class SBI extends Bank
{
    void ATM()
    {
        System.out.println("500000");
    }
    void KYC()
    {
        System.out.println("KYC");
    }
}
class Axis extends Bank
{
    void ATM()
    {
        System.out.println("25000");
    }
    void KYC()
    {
        System.out.println("KYC");
    }
}
public class Demo4
{
    public static void main(String args[]) 
    {
        SBI s = new SBI();
        s.ATM();
        s.KYC();
        //System.out.println("SBI:"+s.roi());
        Axis a = new Axis();
        a.ATM();
        a.KYC();
        //System.out.println("Axis:"+a.roi());
    }    
}
