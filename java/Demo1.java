import java.util.Scanner;
class Emp
{
    int id, age;
	String name;
    Emp()
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID:");
		id = sc.nextInt();
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Age:");
        age = sc.nextInt();
    }

}
class Man extends Emp
{
	String des = "Manager";
	float salary = 100000;
	Man()
	{
		System.out.println("Manager Class");
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+des);
	}
}

class Test extends Emp
{
	String des = "Tester";
	float salary = 40000;
	Test()
	{
		System.out.println("Tester Class");
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+des);
	}
}
class Dev extends Emp
{
	String des = "Developer";
	float salary = 60000;
	Dev()
	{
		System.out.println("Developer Class");
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+des);
	}
}

class Clerk extends Emp
{
	String des = "Clerk";
	float salary = 10000;
	Clerk()
	{
		System.out.println("Clerk Class");
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+des);
	}
}

public class Demo1
{
	public static void main(String args[])
	{
		int ch = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Demo1 Class");
			System.out.println("===========");
			System.out.println("1.Manager");
            System.out.println("2.Developer");
            System.out.println("3.Tester");
			System.out.println("4.Clerk");
			System.out.println("5.Exit");
			System.out.println("Enter Choice: ");
			ch = sc.nextInt();
			if(ch==1)
			{
				Man m = new Man();
				m.display();
			}

			if(ch==2)
			{
				Dev d = new Dev();
				d.display();
			}
            if(ch==3)
			{
				Test t = new Test();
				t.display();
			}

			if(ch==4)
			{
				Clerk c = new Clerk();
				c.display();
			}
            if(ch==5)
			{
				System.out.println("Thank You!");
				System.exit(0);
			}
		}while(ch!=5);			
	}
}