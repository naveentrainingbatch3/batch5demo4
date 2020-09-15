package module2;

public class Person {
	private int id;
	private String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("id-->"+id+"name---"+name);
	
	}
	public void display()
	{
		System.out.println("id-->"+id+"name---"+name);
	}
	public static void main(String[] args) {
		Person p=new Person(12,"Anjali");
		Person p1=new Person(13,"Apoorv");
		p.display();
		p1.display();
		
	}
}
