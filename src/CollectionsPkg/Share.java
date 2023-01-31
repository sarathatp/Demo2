package CollectionsPkg;

public class Share 
{

	public static void main(String[] args) 
	{

		
		Share sh = new Share();
		double Total=sh.add(0.13);
	
		
		
		System.out.println("Total with tax is: "+Total);
		
		
		OverrideMethod om= new OverrideMethod();
		double GrandTotal=om.add(Total);
		System.out.println("Grand total with discount applied: "+GrandTotal);
		

	}

	void add()
	{
		System.out.println("addition");
		
	}
	
	public double add(double a)
	{
		int num1=80,num2=50;
		double Withtax;
		double total=num1+num2;
		System.out.println("Total amount is: "+total);
		
		double taxcalculated=total*a;
		System.out.println("tax is: "+taxcalculated);
		Withtax=total+taxcalculated;
		
		return Withtax;
	}
}





class OverrideMethod extends Share
{
	
	public double add(double Withtax)
	{
		double discount = 0.20;
		
		double DiscountCalculated=Withtax*discount;
		double Withdiscount =Withtax-DiscountCalculated;
		System.out.println("Discount is: "+DiscountCalculated);
		
		
		return Withdiscount;
		
	}
	
	
	
	
}
