package CollectionsPkg;

import java.util.Scanner;

public class FibonacciClass 
{

	public static void main(String[] args) 
	{
		
		int a=0;
		int b=1;
		int c=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many times: ");
		
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++ )
		{
		
		System.out.print(a+",");
		
		a=b;
		b=c;
		c=a+b;
		
		}
		

	}

}
