package module1;

public class Employees {
	private int employeeId;
	private String employeeName;
	static String company="STR Traders";

	static void check()
	{
		company="Amdocs";
	}

	public Employees(int id,String name)
	{
		employeeId=id;
		employeeName=name;
	}
	public void display()
	{
		System.out.println(employeeId+" "+employeeName+" "+company);
	}
	public static void main(String[] args) {
		Employees.check();
		Employees emp1=new Employees(11,"Ruchi");
		Employees emp2=new Employees(12,"Rachit");
		emp1.display();
		emp2.display();
		
	}
}
