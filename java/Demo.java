import java.util.Scanner;
class Dev
{
	int id, age;
	String name;
	String des = "Developer";
	float salary = 60000;

	Dev()
	{
		System.out.println("Developer Class");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID:");
		id = sc.nextInt();

		System.out.println("Enter Name:");
		name = sc.next();
		
		System.out.println("Enter Age:");
        age = sc.nextInt();
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

class Clerk
{
	int id, age;
	String name;
	String des = "Clerk";
	float salary = 10000;

	Clerk()
	{
		System.out.println("Clerk Class");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID:");
		id = sc.nextInt();

		System.out.println("Enter Name:");
		name = sc.next();
		
		System.out.println("Enter Age:");
        age = sc.nextInt();
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

class Demo
{
	public static void main(String args[])
	{
		int ch = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Demo Class");
			System.out.println("==========");
			System.out.println("1.Developer");
			System.out.println("2.Clerk");
			System.out.println("3.Exit");
			System.out.println("Enter Choice: ");
			ch = sc.nextInt();
			if(ch==1)
			{
				Dev d = new Dev();
				d.display();
			}

			if(ch==2)
			{
				Clerk c = new Clerk();
				c.display();
			}
		}while(ch!=3);			
	}
}