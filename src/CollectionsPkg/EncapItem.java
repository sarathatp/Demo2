package CollectionsPkg;


class EncapItem
{
	private int length;
	private int weight;
	
	public void hardDisc(int length, int weight) 
	{
		if(length<1 || weight<1)
		{
			System.out.println("Value should be more than 1");
		}
		else
		{
		System.out.println("hard disk length is:"+length);
		System.out.println("hard disk weight is:"+weight);
		}
		
	}
	
	public int setLength(int l)
	{
		int length=l;
		return length;
	}
	public int getLength()
	{
		return length;
	}
	public int setWeight(int l)
	{
		int length=l;
		return length;
	}
	public int getWeight()
	{
		return length;
	}

}

