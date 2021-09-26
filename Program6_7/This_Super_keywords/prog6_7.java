import java.io.*;
//domain is E commerce
class customer
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name,city,payMode;
	long phone;
	customer()
	{
		name = "Sahil";
	}
	customer(String name)
	{
		this.name=name;
	}

	public void customerData() throws IOException
	{
		System.out.print("Enter Name :");
		this.name = br.readLine();
		System.out.print("Enter Phone :");
		this.phone = Integer.parseInt(br.readLine());
		System.out.print("Enter City :");
		city = br.readLine();
	}

	/*public void display()
	{

		System.out.println("YOUR DETAILS");
		System.out.println("Your Name : "+name);
		System.out.println("Your Phone : "+phone);
		System.out.println("Your City : "+city);
	}*/
	
}


class paymentMode extends customer
{
	String payeeName,itemPurchased,orderDate;
	int payeePhone = 98190626;
	int orderID;
	paymentMode()
	{
		super.phone = payeePhone;
	}

	paymentMode(String name)
	{
		super(name);
	}
	

	public void payMode() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		customerData();
		System.out.print("What is your payment mode? :");
		payMode = br.readLine();

	}
	public void displayPayMode()
	{

		System.out.println("Your Name : "+super.name);
		System.out.println("Your Phone : "+payeePhone);
		System.out.println("Your City : "+super.city);
		System.out.print("Payment mode :"+payMode+"\n");

	}
}

class purchaseDetails extends paymentMode
{
	public void orderDetails() throws IOException
	{
		super.orderID = 1;
		super.orderDate = "2nd September";
		super.itemPurchased = "Television";
		payMode();
	}
	void displayOrderDetails()
	{
		System.out.println("\n"+"ORDER DETAILS");
		System.out.println("\n"+"You Purchased : "+super.itemPurchased);
		System.out.println("Your orderID : "+super.orderID);
		System.out.println("Your Order Date : "+super.orderDate);
		displayPayMode();
	}
}



public class prog6_7 {
	public static void main(String args []) throws IOException
	{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch=0;
		
		purchaseDetails obj1 = new purchaseDetails();
		
		while (ch != 3)
		{
			System.out.println("\n"+"Menu");
			System.out.println("1. Enter Data");
			System.out.println("2. Display Data");
			System.out.print("Enter your Choice :");
			ch = Integer.parseInt(br.readLine());
			if (ch == 1)
			{
				
				obj1.orderDetails();
			}
			if (ch == 2)
			{
		
				obj1.displayOrderDetails();
			}
		}


	}
}
















