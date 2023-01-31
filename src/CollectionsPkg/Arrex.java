package CollectionsPkg;



class test
{
	int a;
}




 class ArrayList
{
	 String input;
	 String inadd;
	void put(String p)
	{
		 input=p;
	}
	
	void add(String a)
	{
		 inadd=a;
	}
	
	String get(String index)
	{
		if(index=="0")
		{
			return input;
		}
		else
		{
			if(index=="1")
			{
				return inadd;
			}
		}
		return index;
	}
	

}
 
class Arrex
{
 
 public static void main(String args[])
 {
	 ArrayList al = new ArrayList();
	 al.add("Samsung");
	 al.put("iPhone");
	 
	 System.out.println(al.get("1"));
	 
	 test obj1 = new test(); 
	 obj1.a = 10;
	 
	
	test obj2 = new test(); 
	obj2.a = 20; 
	
	test obj3 = new test(); 
	obj3.a = 30;
	
	 System.out.println(obj1.a + obj2.a + obj3.a);

 }
}