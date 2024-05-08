
//Adding function for display and raise salary

import java.util.Scanner;

abstract class Emp
{
	int id,age;
	String name;
	float salary;
	String des;
	Emp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		id=sc.nextInt();
		System.out.println(" Enter Name : ");
		name=sc.next();
		System.out.println(" Enter Age : ");
		age=sc.nextInt();			
	}
	public void display()
	{
		System.out.println(" ID "+id);	
		System.out.println(" Name : "+name);	
		System.out.println(" Age "+age);	
		System.out.println(" Salary : "+salary);		
		System.out.println(" Designation : "+des);	
	}
	abstract void raiseSalary();

}
class Manager extends Emp
{	
	Manager()
	{
		salary = 800000;
		des = "Manager";
	}
	void raiseSalary()
	{
		salary = (float)(salary * 1.1);
	}
}
class Tester extends Emp
{
	Tester()
	{
		salary = 300000;
		des = "Tester";
	}		
	void raiseSalary()
	{
		salary = (float)(salary * 1.1);
	}
}
class Dev extends Emp
{
	Dev()
	{
		salary = 60000;
		des = "Developer";
	}	
	void raiseSalary()
	{
		salary = (float)(salary * 1.1);
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		salary = 20000;
		des = "Clerk";	
	}	
	void raiseSalary()
	{
		salary = (float)(salary * 1.1);
	}
}	

public class Emp2
{
	public static void main(String args[])
	{
		int ch1,ch2=0;
		Tester t = null;
		Dev d = null;
		Manager m = null;
		Clerk c = null;
		do{
			System.out.println("1) Create");
			System.out.println("2) Display");
			System.out.println("3) Raise Salary");
			System.out.println("4) Exit");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the choice :");
			ch1= sc.nextInt();
		
			if(ch1==1)
			{
				do{
					System.out.println("1) Developer");
					System.out.println("2) Clerk");
					System.out.println("3) Manager");
					System.out.println("4) Tester");
					System.out.println("5) Exit");
					System.out.print("Enter the choice :");
			 		ch2= sc.nextInt();
		
					if(ch2==1)
					{
						 d = new Dev();
					}
					if(ch2==2)
					{
						 c = new Clerk();
					}
					if(ch2==3)
					{
						 m = new Manager();
					}
					if(ch2==4)
					{
						 t = new Tester();
					}
				}while(ch1!=4);	
			}
			if(ch1==2)
			{
				System.out.println("Display!");
				t.display();
				d.display();
				m.display();
				c.display();
			}
			if(ch1==3)
			{
				System.out.println("Raise Salary .............!");
				t.raiseSalary();
				d.raiseSalary();
				m.raiseSalary();
				c.raiseSalary();
			}
			if(ch1==4)
			{
				System.out.println("Thank You");
				System.exit(0);
			}
		}while(ch1!=4);		
	}
}