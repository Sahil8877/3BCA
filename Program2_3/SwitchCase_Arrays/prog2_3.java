import java.io.*;

public class prog2_3 {
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int menu,n[] = new int [100],i,s,lrg=0,sml=0,occ=0,count=0;
do
{
System.out.println("\n"+"1. Smallest and Largest in Array");
System.out.println("2. Find Occurrence of an Integer");
System.out.println("3. Find Number Repeating More than 3");
System.out.println("4. Find The Sum of Two Matrices");
System.out.print("Enter Choice :");
menu = Integer.parseInt(br.readLine());
switch(menu)
{
case 1:
{
System.out.print("\n"+"Enter the length of the array :");
s = Integer.parseInt(br.readLine());
for (i=0;i<s;i++)
{
	System.out.print("Enter Number " + (i+1)+" :");
	n[i] = Integer.parseInt(br.readLine());
	lrg = sml = n[0]; 
}
for (i=1;i<s;++i)
{
	if (n[i] > lrg)
	{
		lrg=n[i];
	}
	if (n[i] < sml)
	{
		sml=n[i];
	}
}
System.out.println("--------------------------------");
System.out.println(" Largest  :" + lrg);
System.out.println(" Smallest :" + sml);
System.out.println("--------------------------------");
break;
}
case 2 :
{
System.out.print("\n"+"Enter the length of the array :");
s = Integer.parseInt(br.readLine());
for (i=0;i<s;i++)
{
	System.out.println("Enter Number " + (i+1)+" :");
	n[i] = Integer.parseInt(br.readLine());
}
System.out.print("\n"+"Enter Number To Search :");
occ = Integer.parseInt(br.readLine());
System.out.print("\n");
System.out.println("--------------------------------");

for (i=0;i<s;++i)
{
	if (n[i] == occ)
	{
		count ++;
		System.out.println("Found At Pos : " + (i+1));
	}
}
System.out.println("At Least "+ count + " Times");
System.out.println("--------------------------------");
break;
}
case 3:
{
System.out.print("\n"+"Enter the length of the array :");
s = Integer.parseInt(br.readLine());
for (i=0;i<s;i++)
{
	System.out.println("Enter Number " + (i+1)+" :");
	n[i] = Integer.parseInt(br.readLine());
}
int x=0;
System.out.println("--------------------------------");
for (i=0;i<s;++i)
{
	   x = n[i];
		if (n[i] == x)
		{	
			count ++;
		}
		if (count > 3 && n[i] == n[i-1])
		{
			System.out.println("Number Repeated More than Thrice : "+n[i]);
			count = 0;
		}
}
System.out.println("--------------------------------");
break;
}

case 4:
{
int col1,sum=0,row1,col2,row2,j,matrix1[][] = new int [100][100],matrix2[][] = new int [100][100];

//taking input for matrix 1
System.out.print("\n" + "MATRIX 1");
System.out.print("\n"+"Enter the Size of Col for Matrix 1:");
col1 = Integer.parseInt(br.readLine());
System.out.print("Enter the Size of Row for Matrix 1:");
row1 = Integer.parseInt(br.readLine());
System.out.print("\n");

for (i=0;i<row1;i++)
{
	for (j=0;j<col1;j++)
	{
		System.out.print("Enter Number at " + "("+ i +","+ j +")" +" :");
		matrix1[i][j] = Integer.parseInt(br.readLine());
	}
}

//taking input for Matrix 2
System.out.print("\n" + "MATRIX 2");
System.out.print("\n"+"Enter the Size of Col for Matrix 2:");
col2 = Integer.parseInt(br.readLine());
System.out.print("Enter the Size of Row for Matrix 2:");
row2 = Integer.parseInt(br.readLine());
System.out.print("\n");

for (i=0;i<row2;i++)
{
	for (j=0;j<col2;j++)
	{
		System.out.print("Enter Number at " + "("+ i +","+ j +")" +" :");
		matrix2[i][j] = Integer.parseInt(br.readLine());
	}
}

//printing the matrix 1

System.out.print("\n" + "MATRIX 1" + "\n");
for (i=0;i<row1;i++)
{
	for (j=0;j<col1;j++)
	{
		System.out.print(" "+matrix1[i][j]);
	}
	System.out.print("\n");
}

//printing the matrix 2

System.out.print("\n" + "MATRIX 2" + "\n");
for (i=0;i<row2;i++)
{
	for (j=0;j<col2;j++)
	{
		System.out.print(" "+matrix2[i][j]);
	}
	System.out.print("\n");
}

//adding both matrices
System.out.print("\n");
System.out.println("SUM of Both Matrices");
for (i=0;i<row1;i++)
{
	for (j=0;j<col1;j++)
	{
		for (i=0;i<row2;i++)
		{
			for (j=0;j<col2;j++)
			{	
				sum = matrix1[i][j]+matrix2[i][j];
				System.out.print(" " + sum );
			}
			System.out.print("\n");
		}
	}
	System.out.print("\n");
}
break;
}
}
}while(menu < 5);
}
}