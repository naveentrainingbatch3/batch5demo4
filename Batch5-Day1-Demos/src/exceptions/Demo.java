package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
int a,b,c;
	void accept() throws ArithmeticException,InputMismatchException
	{
		System.out.println("Accept Method Started");
		Scanner sc=new Scanner(System.in);	
	//	try
	//	{
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		c=a/b;
	//	}
	/*	catch(Exception ex)
		{
			System.out.println("Parent Exception");
		}*/
		//System.out.println();
	/*	catch(InputMismatchException ex)
		{
			System.out.println("Please enter non decimal integer number");
		}catch(ArithmeticException ex1)
		{
			System.out.println("Please enter Non Zero positive number between 1 to 100");
		}catch(Exception ex)
		{
			System.out.println("Parent Exception");
		}
		finally
		{
			sc.close();
			System.out.println("Finally ");
		
		}*/
		System.out.println("Result"+c);
		System.out.println("Accept Method Ended");
	}
	 void display()
	 {
		 System.out.println("Display Method Started");
	 }
	 public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo d=new Demo();
		try {
		d.accept();
		}catch(InputMismatchException ex)
		{
			System.out.println("Please enter non decimal integer number");
		}catch(ArithmeticException ex1)
		{
			System.out.println("Please enter Non Zero positive number between 1 to 100");
		}catch(Exception ex)
		{
			System.out.println("Parent Exception");
		}
		d.display();
		System.out.println("Main Method Ended");
		
	}
}
