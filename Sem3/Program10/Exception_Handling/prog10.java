import java.io.*;
import java.util.Scanner;
import java.lang.String;

class customExcption extends Exception 
//custom exception class extending Exception class
{
	
}

public class prog10
{
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//customer obj1 = new customer();
		//order obj3=(order) obj1;
		try
		{
	 	
			order obj = new order();
			//Integer.class.getMethod("a");                  //NosuchMethod 
			obj.order();

		}
		catch(Exception e)         //checked exception 2
		{
			System.out.println("No Such Method Exception Occured!");
		}
	}
}

class customer
{


	Scanner s=new Scanner(System.in);
	public void customer()	//throws customExcption
	{
		try
		{

			System.out.println("\tCustomer Info\n");
			System.out.println("Enter your Name :");
			String name = s.next();
			
			//int x = Integer.parseInt(name);          //converting String to Integer
			System.out.println("Enter your phone :");
			String phone = s.next();
			if(phone.length() < 10)
			{
				throw new customExcption();

			}

		}
		catch(customExcption e)
		{
			System.out.println("Error! phone number is invalid");
		}
		catch(java.util.InputMismatchException e) //runtime excp 1
		{
			System.out.println("User Input Mismatch Exception Occured!!");
		}
		catch(java.lang.NumberFormatException e) //runtime exception 4
		{
			System.out.println("\n"+"Number Format Exception Occured !");
		}

	}

}

class product extends customer
{
	
	int i;
	String arr[] = new String[2];
	

	public void product()
	{

		try
		{
			customer();         //calling parent class customer
			System.out.println("\tShopping Cart\n");
			for (i=0;i<2;i++)    //Index i set to 2 
			{
				System.out.print("Enter Product "+(i+1)+" : ");
				arr[i] = s.next();
			}
		}
		catch(java.util.InputMismatchException e)  //runtime exception 1
		{
			System.out.println("User Input Mismatch Exception Occured!!");
		}
		catch(ArrayIndexOutOfBoundsException e)  //runtime exception 3
		{
			System.out.println("Array Index Out Of Bound Exception Occured!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void display()
	{
			System.out.println();
			System.out.println("      **Order Details**"+"\n");
			System.out.println("You Purchased :");
			for (i=0;i<2;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println();

	}

}

class order extends product
{

	public void order()
	{
		try
		{
			

			Object a=0;                        // Class cast exception example
			//String b = (String)a;		       //typecasting object of int value to string variable

			Class.forName("customer");         //loading class during compiletime
			product();
			display();                         //calling parent class product
			System.out.print("Total % of Discount :");
			int discountPercentage = s.nextInt();

			System.out.print("Order Amount :");
			float amount = s.nextFloat();
			float discount = amount/(100)*discountPercentage;  //example for Arithmetic Exception
			System.out.println("Discount : "+discount);
			System.out.println("Final Amount : "+ (amount-discount));
						
		}
		catch(ClassNotFoundException e)         //checked exception 1
		{
			System.out.println("Class Not Found Exception Occured !");
		}
		catch(java.util.InputMismatchException e) //runtime excp 1
		{
			System.out.println("User Input Mismatch Exception Occured!!");
		}
		catch(ArithmeticException e)   //runtime exception 2
		{ 
			System.out.println("Arithmetic Exception Occured!");
		}
		catch(java.lang.ClassCastException e)  //runtime exception 5
		{
			System.out.println("Class Cast Exceptio Occured !");
		}
		
	}

}


























