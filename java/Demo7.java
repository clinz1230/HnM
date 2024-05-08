final class A {
    int site = 5;
    int money = 2000;
    String car = "Benz";
    final int speed = 200;
    final void gear(){
        System.out.println("Class A: 5");

    }    
}

class B extends A{
    void gear(){
        System.out.println("Class B: 5");
    }
}

public class Demo7 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        System.out.println(b.speed);
        b.gear();
        
    }
    
}
