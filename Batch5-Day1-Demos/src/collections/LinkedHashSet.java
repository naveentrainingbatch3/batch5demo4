package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class LinkedHashSet {
public static void main(String[] args) {
TreeSet<String> cl= new TreeSet<String>();

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
	/*for(String s:cl)
	{
		System.out.println("Welcome"+s);
	}*/
	Iterator<String> it=cl.iterator();
	while(it.hasNext())
	{
		System.out.println("Welcome "+it.next());
	}
	cl.remove("Hitesh");
	System.out.println("Collection"+cl);
	//cl.remove(2);
	System.out.println("Collection"+cl);
}
}
