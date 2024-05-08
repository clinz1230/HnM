import java.util.Scanner;

abstract class Emp 
{
    int id;
    String name;
    int age;
    float salary;
    String designation;

    Emp() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        name = sc.next();
        System.out.println("Enter your ID:");
        id = sc.nextInt();
        System.out.println("Enter your Age:");
        age = sc.nextInt();
    }

    void display() 
    {
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
    }

    abstract void raiseSalary();
}

class Dev extends Emp {
    Dev() 
    {
        designation = "Developer";
        salary = 1200000;
    }
    void raiseSalary()
    {    
            salary=(float)(salary*1.1);   
    }
}

class Clerk extends Emp {
    Clerk() 
    {
        designation = "Clerk";
        salary = 600000;
    }
    void raiseSalary()
    {
        salary=(float)(salary*1.1);
    }   
}

class Manager extends Emp {
    Manager() 
    {
        designation = "Manager";
        salary = 1800000;
    }
    void raiseSalary()
    {
        salary=(float)(salary*1.1);
    }  
}

class Tester extends Emp {
    Tester()
    {
        designation = "Tester";
        salary = 700000;
    }
    void raiseSalary()
    {
        salary=(float)(salary*1.1);
    }  
}

ßpublic class Demo6 {
    
}
