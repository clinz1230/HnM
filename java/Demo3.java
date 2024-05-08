class A 
{
    static int x = 1000;
    static void display()
    {
        System.out.println("Hi Display!");
    }
}
public class Demo3 
{
    public static void main(String args[])
    {
        A a = new A();
        a.display();
        System.out.println(A.x);
        A.display();
    }    
}
