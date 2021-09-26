import java.io.*;
 class prog1{
public static void main(String args[ ]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int menu;
do {
System.out.println("\n"+"MENU");
System.out.println("1. Sum of N Digits");
System.out.println("2. Prime Numbers Between A and B");
System.out.println("3. Palindrome Numbers Between 10,000 to 11,000");
System.out.println("4. Exit");
System.out.print("Enter Choice :");
menu = Integer.parseInt(br.readLine());
switch(menu){
	case 1:
	{
		int num[] = new int[20],sum = 0,i=0,n=0;
		System.out.println("Enter total number of digits :");
		n = Integer.parseInt(br.readLine());
		System.out.println("Enter the Numbers : ");
		while (i < n){
		num[i] = Integer.parseInt(br.readLine());
		sum += num[i];
		i++;
		}
   		System.out.println("Sum :" + sum);
		break;
	}
	case 2:
	{
		System.out.println("Enter Number A :");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter Number B :");
		int b = Integer.parseInt(br.readLine());
		//int f=1;
		for(int i = a;i<=b;i++)
		{
			int f=1;
			for(int j = 2; j <= i/2; j++)
		    {
					if (i%j == 0)
					{
						f=0;
						break;
					}
			}
			if (f==1)
			{
				if (i > 1 && i != 0)
				{
				System.out.println("Prime Numbers :" + i);
				}
			}
		}
		break;
	}	
	case 3:
     {
			int num = 0,last,i,rev;
			System.out.println("Palindrome Numbers are :");
			for (i=10000;i<=11000;i++){
			num = i;
			rev = 0;
			while (num  != 0){
				
				last = num%10; 
				num = num/10;
				rev = rev*10+last; 
				}
			if (i == rev){
				System.out.println(i);
			}
			}
			break;
     }
}
}while(menu < 4);
}
}