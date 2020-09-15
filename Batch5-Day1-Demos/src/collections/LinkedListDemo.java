package collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {LinkedList<String> cl = new LinkedList<String>();

	cl.add("Celina");
	cl.add("Anjali");
	cl.add("Atul");
	cl.add("Apoorv");
	cl.add("Avin");
	cl.add("Gyan");
	cl.add("Hardik");
	cl.add("Hitesh");
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
	cl.addFirst("Sizman");
	System.out.println("Collection"+cl);
	cl.addLast("Saurav");
	cl.add("Hitesh");
	System.out.println("Collection"+cl);



	}
}
