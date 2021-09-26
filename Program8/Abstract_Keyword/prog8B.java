import java.io.*;

/* code for ABSTRACT keyword */

abstract class customer
{
	void customer()
	{
	System.out.println("This is Abstract");
	}
	abstract void details(String name); 
}

class customerDetail extends customer
{
	void details(String name)
	{
		super.customer();
		detail();
		System.out.println("Name : "+name);
	}
	void detail() 
	{
		int n = 1;
		//super.customer();
		System.out.println("OrderID : "+n);
	}
}

class purchase extends customerDetail
{
	void details(String name)
	{
		super.details("Sahil");
		System.out.println("Item : "+name);
	}
}

public class prog8B
{
	public static void main(String[] args) throws IOException
	{
		/* CODE FOR ABSTRACTION */

		purchase obj = new purchase();

		obj.details("AC");

	}
}

