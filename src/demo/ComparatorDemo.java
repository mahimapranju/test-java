package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String args[]) throws Exception
	{
		List<Integer>values = new ArrayList<Integer>();
		values.add(309);
		values.add(998);
		values.add(774);
		values.add(2);
		values.add(88);

		
		//using lambda expression - just mention or specify the logic
		Comparator<Integer>com = (o1,o2) ->
		{
			return o1%10 > o2%10 ?1:-1;
		};
		
		Collections.sort(values,com);
	
		for(int i:values)
		{
			System.out.println(i);
		}
		
	}
}
