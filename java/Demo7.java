
// functioning of interfaces

interface I
{
	public static int a=100;
	//I(){}
	abstract void abc();
	void xyz();
	void atoz();
}
interface  J
{
}
interface K  extends I,J 
{
}
class Demo7
{
	public  static void main(String args[])
	{
		// K k= new K();
		System.out.println(K.a);
	}
}