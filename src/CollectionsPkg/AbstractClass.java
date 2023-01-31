package CollectionsPkg;

public class AbstractClass 
{

	public static void main(String[] args) 
	{
		maths m =new maths();
		m.add();
		m.multiply();
		

	}

}

abstract class calculator
{
	abstract void add();
	
	void multiply()
	{
		int a=2,b=3;
		int c=a*b;
		
		System.out.println(c);
	}
	
}

class maths extends calculator
{
	void add()
	{
		int a=2, b=3, c;
		c=a+b;
		System.out.println(c);
	}
}



