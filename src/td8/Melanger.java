package td8;

import java.util.ArrayList;
import java.util.List;

public class Melanger {
	private static <T> List<T> melanger(List<T> list,int a,int b)
	{
		ArrayList<Object> melangerList=new ArrayList<Object>();
		if(a<0||a>list.size())
		{
			throw new IllegalArgumentException("We can not use "+a);
		}
		else if(b<0||b>list.size())
		{
			throw new IllegalArgumentException("We can not use "+b);
		}
		else if(list==null)
		{
			throw new IllegalArgumentException("The list can not be null");
		}
		else {
			
		}
		return (List<T>) melangerList;
	}
}
