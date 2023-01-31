package CollectionsPkg;

import java.io.InputStream;
import java.util.Scanner;


public class ReverseString 
{

	public static void main(String[] args) 
	{
//		String str = "saras";
		
		//Scanner sc = Scanner(System.in);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter text:");
		String str = sc.nextLine();
		
		System.out.println(reverseStringMethod(str));
		
		
		
	}
	
	


	static boolean reverseStringMethod(String str)
	{
		if(str==null)
		{
			return false;
		}
		StringBuilder sb = new StringBuilder();
		
		char[] ch;
		ch = str.toCharArray();
		
		for(int i = ch.length-1; i>=0;i--)
		{
			sb.append(ch[i]);
		}
		
		return sb.toString().equals(str);
		
	}
	
	
	
	

}












































//		String str = "1234";
//		
//		String str_reversed=reverse(str);
//		System.out.println(str_reversed);
//
//	}
//	
//	public static String reverse(String str)
//	{
//		StringBuilder sb = new StringBuilder();
//	
//		
//		
//		char[] stringvalues = str.toCharArray();
//		
//		for(int i = stringvalues.length-1;i>=0;i--)
//		{
//			sb.append(stringvalues[i]);
//		}
//		
//		
//		return sb.toString();
		
//	}
//
//}
