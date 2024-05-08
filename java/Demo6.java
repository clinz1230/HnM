
// functioning of abstract class and methods
// abstract method declared in parent abstract class should be overrided / defined in child class

abstract class A
{
	A(){}
	abstract void abc();
}
abstract class B extends A
{
	void abc()
	{
		System.out.println("Inside class B");
	}
	abstract void xyz();
}
class C  extends B
{
	void xyz()
	{
		System.out.println("Inside class C");
	}
}

class Demo6
{
	public  static void main(String args[])
	{
		C c = new C();	
		c.xyz();
		c.abc();
	}
}