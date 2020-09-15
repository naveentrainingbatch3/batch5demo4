package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cl = new ArrayList<String>();

		cl.add("Celina");
		cl.add("Anjali");
		cl.add("Atul");
		cl.add("Apoorv");
		cl.add("Avin");
		cl.add("Gyan");
		cl.add("Hardik");
		cl.add("Hitesh");
		System.out.println("Collection"+cl);
		for(String s:cl)
		{
			System.out.println("Welcome"+s);
		}
		cl.remove("Hitesh");
		System.out.println("Collection"+cl);
		cl.remove(2);
		System.out.println("Collection"+cl);
		cl.add(3,"Shripriya");
		System.out.println("Collection"+cl);

	}
}
