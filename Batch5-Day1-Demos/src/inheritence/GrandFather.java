package inheritence;

public class GrandFather {
	public GrandFather() {
                System.out.println("Apoorve Sharma");
		System.out.println("GrandFather Class");
	}
 void ownedProperty()
 {
System.out.println("5 acres of Land");	 
 }
}

class Father extends GrandFather {
	public Father() {
		
		System.out.println("Father Class");
	}
 void ownedAddtionalProperty()
 {
	 System.out.println("10 acres of land");
 }
}

class Son extends Father {
	public Son() {
		
		System.out.println("Son Class");
	}
 void ownednewBungalow()
 {
	 System.out.println("He will construct a Bungalow within one acre of additional Land");
 }
	public static void main(String[] args) {
		
		GrandFather gf = new Son();
		gf.ownedProperty();
		Father f=(Father)gf;//downcasting
		f.ownedAddtionalProperty();
		  Son s= (Son)f;//downCasting
		  s.ownednewBungalow();
	}
}
