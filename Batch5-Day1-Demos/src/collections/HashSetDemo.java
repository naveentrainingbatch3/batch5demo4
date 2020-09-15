package collections;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> cl = new HashSet<String>();

	cl.add("Celina");
	cl.add("Anjali");
	cl.add("Atul");
	cl.add("Apoorv");
	cl.add("Avin");
	cl.add("Gyan");
	cl.add("Hardik");
	cl.add("Hitesh");
	cl.add("Gyan");
	System.out.println("Collection"+cl);
	for(String s:cl)
	{
		System.out.println("Welcome"+s);
	}
	cl.remove("Hitesh");
	System.out.println("Collection"+cl);
	cl.remove(2);
	System.out.println("Collection"+cl);
	
}
}
