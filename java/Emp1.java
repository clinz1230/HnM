
// Create an Employee Class with features
// Create Classes [ Developer, Tester, Manager, Clerk ] that extends Emp Class 

import java.util.Scanner;
class Emp
{
    int id, age;
	String name,des;
	float salary;
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
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+des);
	}

}
class Man extends Emp
{
	Man()
	{
		des = "Manager";
		salary = 100000;
		System.out.println("Manager Class");
	}
}

class Test extends Emp
{
	Test()
	{
		des = "Tester";
		salary = 40000;
		System.out.println("Tester Class");
	}
}
class Dev extends Emp
{
	Dev()
	{
		des = "Developer";
		salary = 60000;
		System.out.println("Developer Class");
	}
}

class Clerk extends Emp
{
	Clerk()
	{
		des = "Clerk";
		salary = 10000;
		System.out.println("Clerk Class");
	}
}

public class Emp1
{
	public static void main(String args[])
	{
		int ch = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Emp1 Class");
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