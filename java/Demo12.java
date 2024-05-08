abstract class Bank
{
	abstract void ATM();
	abstract void KYC();

} 
class SBI extends Bank
{
	 void ATM(){
		System.out.println("500000");
	}
	 void KYC(){
		System.out.println("KYC");

	}
}	
class Axis extends Bank
{
	 void ATM(){
		System.out.println("25000");
	}
	void KYC(){
		System.out.println("KYC");

	}
}
class Demo12
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		s.KYC();

		Axis a = new Axis();
		a.OT();
	}
}