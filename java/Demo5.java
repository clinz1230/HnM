
//functioning of interfaces and multiple inheritance using interfaces

interface I{
    int a = 10;
    void add();
    void sub();
}

interface J{
    int b = 20;
    void mul();
    void div();
}

interface K extends I,J{

}
class Clerk{

}

class Cal extends Clerk implements K{
    public void sub(){
        System.out.println("A - B: "+(I.a - J.b));
    }
    public void add(){
        System.out.println("A + B: "+(I.a + J.b));
    }
    public void mul(){
        System.out.println("A * B: "+(I.a * J.b));
    }
    public void div(){
        System.out.println("A / B: "+(I.a / J.b));
    }
}

public class Demo5 {
    public static void main(String args[]) {
        Cal c = new Cal();
        c.add();
        c.sub();
        c.mul();
        c.div();        
    }
}
