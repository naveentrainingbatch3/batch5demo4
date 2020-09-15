package creational.factory;

public class TestMain {
	public static void main(String[] args) {
		CarFactory factory=new CarFactory();
		Car c1=factory.getCar("edurekacar");
		c1.start();
		c1.drive();
		c1.applybreak();
		c1.stop();
		Car c2=factory.getCar("AmdocsCar");
		c2.start();
		c2.drive();
		c2.applybreak();
		c2.stop();
	}
}
