package inheritence;

public abstract class Demo {
Demo()
{
	System.out.println("Demo Class Constructor");
}
	 abstract void display();
	static void show()
	{
		System.out.println("Show method");
	}
	
	
}
class Test extends Demo
{
	Test()
	{
		System.out.println("Test Class Constructor");
	}
	void display()
	{
		System.out.println("Display method in child Class");
	}
	public static void main(String[] args) {
		Demo d=new Test();
		d.display();//upcasting
		d.show();
	
	}
}