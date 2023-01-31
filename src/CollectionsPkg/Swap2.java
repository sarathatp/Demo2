package CollectionsPkg;

import java.util.Scanner;

public class Swap2 
{

	public static void main(String[] args) 
	{
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value:\n");
	
		a=sc.nextInt();
		
		System.out.print("Enter b value:\n");
		b=sc.nextInt();		
		
		System.out.println("value of a is: "+a+", value of b is: "+b);
		
		a=a+b;
		
		b=a-b;
		a=a-b;
		
		System.out.println("value of a is: "+a+", value of b is: "+b);

	}

}
