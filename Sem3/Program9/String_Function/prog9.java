import java.lang.String;
import java.io.*;

public class prog9 
{
	public static void main(String[] args)
	{
		string obj = new string();
		obj.string();
	}
}

class string
{
	stringFunctions obj1 = new stringFunctions();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Byte ch;
	void string()
	{
		try
		{
			do
			{
				System.out.println();
				System.out.println("\t\t\tMENU\n");
				System.out.println("\t\t1. SUBSTRING");
				System.out.println("\t\t2. REPLACE WORDS");
				System.out.println("\t\t3. FIND LENGTH OF STRING");
				System.out.println("\t\t4. UPPER-LOWER CASE");
				System.out.println("\t\t5. STARTING_ENDING CHARACTER");
				System.out.println("\t\t6. TRIM STRING");
				System.out.println("\t\t7. CONCATINATION");
				System.out.println("\t\t8. EXIT MENU");
				System.out.printf("\tEnter your choice: ");
				ch = Byte.parseByte(br.readLine());
				if (ch < 1 || ch > 8)
				{
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("\n\n\t\tWrong Input !"+"\n");
					System.out.println();
					System.out.println();
				}
				System.out.println("");
				switch (ch) 
				{
					case 1:
						obj1.substr();
						break;
					case 2:
						obj1.replace();
						break;
					case 3:
						obj1.length();
						break;
					case 4:
						obj1.upperLowerCase();
						break;
					case 5:
						obj1.end_startWith();
						break;
					case 6:
						obj1.trim();
						break;
					case 7:
						obj1.concat();
						break;
					default:
						break;
				
				 } 
			} while(ch != 8);	
		}
		catch(IOException e)
		{
			System.out.println("IOException caught");
		}
		catch(java.lang.NumberFormatException e)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("\n\n\t\tPlease try again !"+"\n");
			System.out.println();
			System.out.println();
			string();
		}
	}
}

class stringFunctions
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = "";
	String str1 = "";
	String str2 = "";
	byte input1;
	byte input2;
	void upperLowerCase()
	{
		try
		{
			System.out.print("Enter a word : ");
			str = br.readLine();
			System.out.println("UpperCase :"+str.toUpperCase());
			System.out.println("LowerCase :"+str.toLowerCase());
		}
		catch(IOException e)
		{
			System.out.println("IOException caught");
		}
	}

	void trim()
	{
		try
		{
			System.out.print("Enter a string with spaces: ");
			str = br.readLine();
			System.out.println("After trim :"+str.trim());
		}
		catch(IOException e)
		{	
			System.out.println("IOException caught");
		}
	}

	void length()
	{
		try
		{
			System.out.print("Enter a string without spaces: ");
			str = br.readLine();
			System.out.println("String Length :"+str.length());
		}
		catch(IOException e)
		{	
			System.out.println("IOException caught");
		}
	}


	void concat()
	{
		try
		{
			System.out.print("Enter 1st word without spaces: ");
			str = br.readLine();
			System.out.print("Enter 2nd word without spaces: ");
			str1 = br.readLine();
			System.out.println("After Concatination :"+str.concat(""+str1));
		}
		catch(IOException e)
		{	
			System.out.println("IOException caught");
		}
	}


	void end_startWith()
	{
		try
		{
			System.out.print("Enter words without space: ");
			str = br.readLine();
			System.out.print("Enter starting words: ");
			str1 = br.readLine();
			System.out.print("Enter ending words: ");
			str2 = br.readLine();
			System.out.println("Starts with : "+str1);
			System.out.println(str.startsWith(str1));
			System.out.println("Ends with : "+str2);
			System.out.println(str.endsWith(str2));
		}
		catch(IOException e)
		{	
			System.out.println("IOException caught");
		}
	}


	void replace()
	{
		try
		{
			System.out.print("Enter a word without spaces: ");
			str = br.readLine();
			str = str.toLowerCase();
			System.out.print("Enter word to be replaced: ");
			str1 = br.readLine();
			str1 = str1.toLowerCase();
			System.out.print("Enter word to be replaced with: ");
			str2 = br.readLine();
			str2 = str2.toLowerCase();
			String replaceString = str.replace(str1, str2);
			System.out.println("Replaced '"+str1+"' with : "+replaceString);
		}
		catch(IOException e)
		{	
			System.out.println("IOException caught");
		}
	}

	void substr()
	{
		try
		{
			System.out.print("Enter String without spaces :");
			str = br.readLine();
			System.out.print("Enter starting index (starts at 0): ");
			input1 = Byte.parseByte(br.readLine());
			System.out.print("Enter ending index (starts at 1): ");
			input2 = Byte.parseByte(br.readLine());
			System.out.println("Your Word : "+str.substring(input1, input2));
		}
		catch(IOException e)
		{	
			System.out.println("IOException caught");
		}
	}

}














































