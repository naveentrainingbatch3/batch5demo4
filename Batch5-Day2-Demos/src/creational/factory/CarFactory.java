package creational.factory;

public class CarFactory {

public Car getCar(String carName)
{
	if(carName==null)
	{
		return null;
	}else if(carName.equalsIgnoreCase("EdurekaCar"))
	{
		return new EdurekaCar();
	}else if(carName.equalsIgnoreCase("AmdocsCar"))
	{
		return new Amdocs();
	}
		
	return null;
}
}
