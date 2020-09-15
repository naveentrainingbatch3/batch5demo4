package creational.singleton;

public class TestMain {
public static void main(String[] args) {
	//SingleTon singelTon=new SingleTon();
	SingleTon singleTon=SingleTon.getInstance();
	System.out.println(singleTon.hashCode());
	SingleTon singleTon1=SingleTon.getInstance();
	System.out.println(singleTon1.hashCode());
	
}
}
