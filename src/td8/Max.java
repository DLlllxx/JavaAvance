package td8;

public class Max<T extends Comparable<T>>{

	public T myMax(T a, T b){                 	   
		if (a != null && b != null) {	   
			return a.compareTo(b) > 0? a : b;   
		}else {	   
			throw new IllegalArgumentException("the paramter is empty");   
		} 
	}
 
	public T myMax(T a, T b, T c) {  
		return myMax(a, myMax(b, c));
	}
}
