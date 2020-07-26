package pkg1;

public class Student 
{
	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] arg)
	{
		Student obj= new Student();
		obj.display1();
		obj.display2();
		obj.age=22;
		obj.age= 24;
		System.out.println("Age is " + obj.age); // takes updated value
		obj.roll_no= 11;
		System.out.println("Roll no. is " + obj.age);
		obj.age=26;
		System.out.println("New age is " + obj.age);
	}
}
