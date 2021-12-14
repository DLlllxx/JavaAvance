package td8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		List<Integer> list2=Arrays.asList(1,2,3,4,5);
		BeWild.print(list);
		BeWild.print(list2);
		
		BeWild.longeur(list);
		BeWild.longeur(list2);
		
		List<String> l=Arrays.asList("colonel", "reyel");
		System.out.println(BeWild.listLength(l));
		
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=BeWild.fusion(l1,l2);
		List<?> r2=BeWild.fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		
		List<Integer> l5 = new LinkedList<Integer>();
		l5.add(4);
		l5.add(5);
		
		List<Integer> r3 = BeWild.fusion(l3,l4);
		List<?> r4 = BeWild.fusion(l1,l3);
		List<?> r5 = BeWild.fusion(l1,l5);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}
