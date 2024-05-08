

import java.util.Scanner;

abstract class Emp
{
	int id,age;
	String name;
	int salary;
	String desig;
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
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
	public abstract  void raiseSalry();

}
class Manager extends Emp
{	
	Manager()
	{
		salary=800000;
		desig="Manager";
	}
}
class Tester extends Emp
{
	
	int salary=300000;
	String desig="Tester";
	Tester()
	{
	}		
}
class Dev extends Emp
{
	int salary=60000;
	String desig="Developer";
	Dev()
	{
	}	
}
class Clerk extends Emp
{
	
	int salary=20000;
	String desig="Clerk";
	Clerk()
	{	
	}	
}	

public class Demo10
{
	public static void main(String args[])
	{
		int ch1,ch2=0;
		Tester t=null;
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

					System.out.println("3) Exit");

					System.out.print("Enter the choice :");
			 		ch2= sc.nextInt();
		
					if(ch2==1)
					{
						Dev d = new Dev();
					}
					if(ch2==2)
					{
						Clerk c = new Clerk();
					}
					if(ch2==3)
					{
						Manager m = new Manager();
					}
					if(ch2==4)
					{
						t = new Tester();
					}
				}while(ch1!=4);	
			}
			if(ch1==2)
			{
				t.display();			
			}
			if(ch1==3)
			{
					System.out.println("Raise Salary .............!");
					10 % ;
					t.raiseSalry();
			}
			if(ch1==4)
			{
				System.out.println("Thank You");
				System.exit(0);
			}

		}while(ch1!=4);
		
	}
}

