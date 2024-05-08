
// Showing working of static member and functions in a class

class A 
{
    static int x = 1000;
    static void display()
    {
        System.out.println("Hi Display!");
    }
}
public class Demo2 
{
    public static void main(String args[])
    {
        A a = new A();
        A.display();
        System.out.println(A.x);
        // a.x = 2000;
        // a.display();
        // System.out.println(a.x);
    }    
}
