package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		c.add(40);
		c.add(30);
		c.add(50);
		//c.add("Naveen");
		c.add(60);
		Demo d=new Demo();
		int p=d.sum(c);
		System.out.println("Sum"+p);
	}

	private int sum(Collection<Integer> c) {
		int x=0,y=0;
		for(Integer o:c)
		{
			//Integer i=(Integer)o;//Downcasting
			x= o;//AutoUnboxing
			y+=x;
		}
		return y;
	}

	}
