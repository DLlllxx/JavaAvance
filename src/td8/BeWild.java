package td8;
import java.util.*;


public class BeWild <T extends List<?>>{
	
	public static <T> void print(List<T> list) {
		for(T o:list)
			System.out.println(o);
	}
	
	public static <T> void longeur(List<T> list) {
		CharSequence cs;
		for(T o:list) {
			cs = o.toString();
			System.out.println(cs);
			System.out.println("Length : " + cs.length());
		}
	}
	
	public static <T> List<T> listLength(List<?> list) {	
		ArrayList<Integer> length=new ArrayList<Integer>();	
		for(int i=0;i<list.size();i++) {
			CharSequence seq=(CharSequence)list.get(i);
			length.add(seq.length());
		}
		return (List<T>) length;	
	}
	
	public static <T> List<T> fusion(List<?> l1, List<?> l2){
		ArrayList<Object> alternateList = new ArrayList<Object>();
		
		if (l1 == null ||l2 == null)
			throw new IllegalArgumentException("The list can not be null!");
		else if (l1.size() != l2.size())
			System.out.println("The size of 2 lists are not fusible");
		else {
			
			for (int i = 0; i< l1.size(); i++) {
				alternateList.add(l1.get(i));
				alternateList.add(l2.get(i));
			}
		}
		
		return (List<T>) alternateList;
	}

}