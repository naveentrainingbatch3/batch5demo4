package creational.singleton;

public class SingleTon {
//Have a private static instance variable
	private static SingleTon instance;
	//Eager Loading
	private static SingleTon instance1=new SingleTon();
	//Make your constructor private
	private SingleTon()
	{
		
	}
	
	
	//Have a method which will create one instance
	//and share to various reference// Lazy Loading
	public static SingleTon getInstance()
	{
		synchronized (SingleTon.class) {
			
		
		if(instance==null)
		{
		instance=new SingleTon();
		}
		return instance;
		}
	}
	
}
