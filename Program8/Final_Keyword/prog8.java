import java.io.*;

/* Code for FINAL keyword */

class platform                       //final example for class
{

	 final String brand = "Amazon";       //example for final variable
	 int orderAmt = 1200;

	 final void orderDetails()             //final example for method
	 {
	 	String detail = "TV";
	 	System.out.println("You Ordered : "+detail);
	 }
}

class customer extends platform
{

	void details()
	{
		//super.brand = "Flipkart";

	    System.out.println("Your Brand is : "+super.brand);
	    System.out.println("Your Amt is : "+super.orderAmt);
	    super.orderDetails();
	}
	/*void orderDetail()                     //overriding method
		{
	 		String detail = "AC";
	 		System.out.println("You Ordered : "+detail);
	 	}*/
}


public class prog8
{
public static void main(String[] args) //throws IOException
	{
		/* CODE FOR FINAL */

		customer obj = new customer();
		
		obj.details();
		//obj.orderDetails();

	}
}







