import java.io.*;
import java.util.Scanner;
import java.lang.String;

class prog11
{
	public static void main(String args [])
	{
		Scanner s = new Scanner(System.in);
		try
		{
			myinterface3 obj=new customer();
			//customer obj = new customer();
			System.out.print("Enter you phone :");
			String phone = s.next();
			obj.phone(phone);
			
		}
		catch (Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
}

interface myinterface1
{
	void name();
	void phone(String phone);
}
interface myinterface2 extends myinterface1
{
	void product_name(String product_name);
	void product_id();
}
interface myinterface3 extends myinterface2
{
	void brand_name(String brand_name);
}

abstract class customer_name
{
	String name,id,brand_name,product_name,b_name,phone;
	Scanner s = new Scanner(System.in);
	//customer obj = new customer();
	public void name()
	{
		System.out.print("Enter your name :");
		name = s.next();
	}
}

class customer extends customer_name implements myinterface3
{
	int product_id;
	public customer()
	{
		super.name();
	}
	public void phone(String phone)
	{
		try
		{
			this.phone = phone;
			if (phone.length() < 10)
			{
				throw new ArithmeticException();
			}
			System.out.print("Enter name of your product :");
			product_name = s.next();
			product_name(product_name);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Phone number cannot be less than 10 digits");
		}
	}

	public void product_name(String product_name)
	{
		try
		{
			System.out.print("Enter product ID :");
			product_id = s.nextInt();
			product_id();
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.print("Product ID should be Integer");
		}
	}

	public void product_id()
	{
		try
		{
			if (product_id == 0)
			{
				throw new ArithmeticException();
			}
			System.out.print("Enter name of the brand :");
			brand_name = s.next();
			brand_name(brand_name);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Product ID cannot be null");
		}
	}

	public void brand_name(String brand_name)
	{
		b_name = brand_name.toLowerCase();
		display();
	}
	void display()
	{
		System.out.println();
		System.out.println("      **Customer Details**"+"\n");
		System.out.println("Your Name : "+name);
		System.out.println("Your Phone : "+phone+"\n");
		System.out.println("       **Order Details**"+"\n");
		System.out.println("You Purchased : " +product_name);
		System.out.println("Product ID : "+product_id);
		System.out.println("Your Brand : "+b_name);
		System.out.println();
	}
}








