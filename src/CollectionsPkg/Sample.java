package CollectionsPkg;

import java.util.Random;
import java.util.Scanner;

public class Sample 
{

	public static void main(String[] args) 
	{
		
//		int a[] = {2, 34,50,90000,400};
//		
//		//System.out.println(a[3]);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter numbers into array b[]:");
//		
//		int b[] = new int[5];
//		
//	
//				
//		for(int i=1; i<=4;i++)
//		{
//			b[i]=sc.nextInt();
//			
//		}
//		System.out.println("Elements in array b are: ");
//		for(int i=1;i<=4;i++)
//		{
//			System.out.println(b[i]);
//		}
////		for(int j: b)
////			System.out.println(j);
////		
////		
		
		
		
		
		
		
		
		
		Random r = new Random();
		
		int g[]=new int[5];
//		
//		g[0]=800;
//		g[1]=90;
//		g[2]=3;
//		g[3]=20;
//		g[4]=7000;
//		Scanner sc = new Scanner(System.in);
//		
//			System.out.println("enter numbers");
//		for(int num=0;num<=4;num++)
//		{
//			g[num]=sc.nextInt();
//		}
		//System.out.println(g[3]);
//			for(int i:g)
//			{
//				System.out.println(i);
//			}
////		
//		for(int i=0;i<=4;i++)
//		{
//			g[i]=r.nextInt(1000);
//		}
		
		
//		for(int i=0;i<=4;i++)
//		{
//			System.out.println(g[i]);
//		}
//		
		int z=0;
		while(z<=4)
		{
			g[z]=r.nextInt(5);
			z++;
		}
		
		
		int p=0;
		do
		{
			System.out.println(g[p]);
			p++;
		}while(p<=4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
