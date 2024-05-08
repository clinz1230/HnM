abstract class A
{
	A(){}
	abstract void abc();
}
abstract class B extends A
{
	void abc()
	{
	
	}
	abstract void xyz();
}
class C  extends B
{
	void xyz()
	{
	
	}
}
class Demo13
{
	public  static void main(String args[])
	{
		//A a = new A();	
		//a.abc();
	}

}