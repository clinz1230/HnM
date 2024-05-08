
// Functioning of keyword super and method overriding 

class P 
{
	int money = 200000;
	String car = "BMW";
	int site = 5; 
	
	void use()
	{
        System.out.println(" Class P ");
		System.out.println(" Class P Money :"+money);
		System.out.println(" Class P Car :"+car);
		System.out.println(" Class P Site :"+site);
	}
}
class C  extends  P 
{
	int money = 100000;
    String car = "Benz";
	int site = 15; 
	void use()
	{
        super.use();
        System.out.println(" Class C ");
		System.out.println(" Money :"+ money);
		System.out.println(" Parent Money :"+ super.money);
		System.out.println(" Car :"+ car);
        System.out.println(" Parent Car :"+ super.car);
		System.out.println(" Site :"+ site);
		System.out.println(" Parent Site :"+ super.site);
	}
}
public class Demo4
{
	public static void main(String args[])
	{
		C c = new C();
		c.use();
	}
}

