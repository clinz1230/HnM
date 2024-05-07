class A
{
    A()
    {
        System.out.println("A()");
    }
    A(int a)
    {
        System.out.println("A(int a)");
        System.out.println(a);
    }
    A(int a, int b)
    {
        System.out.println("A(int a, int b)");   
        System.out.println(a+","+b);     
    }
    A(String a, int b)
    {
        System.out.println("A(String a, int b)");
        System.out.println(a+" , "+b);     
    }
}

public class Demo2
{
    public static void main(String args[]) 
    {
        A a = new A();
        A a1 = new A(100);
        A a2 = new A(100,200);
        A a3 = new A("Clinz", 100);    
    }
}