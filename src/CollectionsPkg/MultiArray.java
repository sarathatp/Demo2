package CollectionsPkg;

public class MultiArray 
{

	public static void main(String[] args) 
	{
		
		int a[][]= new int[2][3];
		
		a[0][0]=50;
		a[0][1]=60;
		a[0][2]=70;
		a[1][0]=200;
		
		int b[][]= {{50,60,70},{200,300,400}};
		
		//System.out.println(a[0][1]);
		//System.out.println(b[0][1]);
		System.out.println("length of array b is: "+b.length);
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
				

	}

}