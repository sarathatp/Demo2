package CollectionsPkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				int values[] = new int[4];
				
				Object value[] = new Object[4];
				value[0]=25;
				value[1]=30.5;
				value[2]="data";
				value[3]=40;
				//value[4]=85000;
				
				//System.out.println(value[3]);
				
				ArrayList<Integer> val = new ArrayList<Integer>();
				val.add(23);
				val.add(90000);
				val.add(85000);
				val.add(1,35);
				val.add(2,20000);
				
				Collections.sort(val);
				
				
				Iterator it = val.iterator();	
				
				while(it.hasNext()) 
				{
					System.out.println(it.next());
				}
				
				
	
	
	}
				
}
