import java.io.*;

class Customer
{
	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
	private String name,add,mode,city,country,product;
	private long pincode,phone;
	private byte age;
	private float amount;
	private short id=0; 

	public  Customer()
	{
		name = "Sahil";
		age = 19;
		add = "A301 Road";
		//city = "kolkata";
		country = "INDIA";
		phone = 9098098780L;
		pincode = 90980;
                                   
	}
	
	public Customer(short ID, float Amount)
	{
       		id = ID;
		mode = "Cash";
		amount = Amount;
	}
   	public Customer(String City, String Product)
	{
                                 
        		city = City;
		product = Product;

	}
	public void read() throws IOException
	{
	System.out.println();
	System.out.print("Enter Your Name :");
	name = br.readLine();
	System.out.print("Enter Your Age :");
	age = Byte.parseByte(br.readLine());
	System.out.print("Enter Your Address :");
	add = br.readLine();
	System.out.print("Enter Your Contact No :");
	phone = Long.parseLong(br.readLine());
	System.out.print("Enter Your City :");
 	city = br.readLine();
	System.out.print("Enter Your Country :");
	country = br.readLine();
	System.out.print("Enter Your Pin code :");
	pincode = Long.parseLong(br.readLine());
    	System.out.print("Enter Product ID :");
	id = Short.parseShort(br.readLine());
	System.out.print("Enter Product Name :");
	product = br.readLine();
	System.out.print("Enter Your Mode of Payment :");
	mode = br.readLine();
	System.out.print("Enter Your Amount :");
	amount = Float.parseFloat(br.readLine());
	}
	
	byte search(Short OrderID)
	{
		byte found;
		if (id == OrderID)
		{
			found = 1;
		}
		else
		{
			found = 0;
		}
		return found;
	}
	public void disp() 
	{
	System.out.println("Order ID :"+id);
	System.out.println();
	System.out.println("Customer Name = "+name);
	System.out.println("Customer Age = "+age);
	System.out.println("Customer Add = "+add);
	System.out.println("Customer Phone = "+phone);
	System.out.println("Customer City = "+city);
	System.out.println("Customer Country = "+country);
	System.out.println("Customer Pincode = "+pincode);
    	System.out.println("Product ID = "+id);
	System.out.println("Product Name = "+product);
	System.out.println("Product Payment Mode = "+mode);
	System.out.println("Total Amount = "+amount);
	}


}
public class prog4
{
		public static void main (String args[]) throws IOException
		{
				BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
				boolean ch=true;
				byte s = 0;
				int menu;
				Customer obj1=new Customer();
				Customer obj2=new Customer((short)1,1900);
		                 Customer obj3=new Customer("KOLKATA","EARPHONES");
				Customer obj=new Customer();
				while(ch)
				{	
					System.out.println("\n"+"MENU");
					System.out.println("1. Display Constructors");
					System.out.println("2. Read New Data");
					System.out.println("3. Search Constructor with ID");
					System.out.print("Enter Choice :");
					menu = Integer.parseInt(br.readLine());
					switch (menu)
					{
					case 1:
						{	
								System.out.println("\n"+"—Constructor 1—");
								obj1.disp();
								System.out.println("\n"+"—Constructor 2—");
								obj2.disp();
								System.out.println("\n"+"—Constructor 3—");
                                obj3.disp();
								break;
						}
					case 2:
						{
								obj.read();
								System.out.println("\n"+"—Your Details—");
								obj.disp();
								break;
						}
					case 3:
						{
								
								short OrderID;
								System.out.print("Enter Order ID to Search :");
								OrderID = Short.parseShort(br.readLine());
								s = obj.search(OrderID);
								if (s == 1)
								{
									System.out.println("--Order Details--");
									obj.disp();
									break;
								}
								else
								{
									System.out.println("Sorry! No Such Order ID");
								}
								break;
						}
					}
					if (menu > 3)
						break;
				}
		}
}