package td4;

import java.util.ArrayList;
import java.util.HashSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //Exercice 1	
		Car a = new Car("Audi", 10000);
		Car b = new Car("BMW", 9000);
		Car c = new Car("BMW", 9000);
		
		garage garage = new garage();
		garage.add(a);
		garage.add(b);
		garage.add(c);
		Car car = garage.firstCarByBrand("BMW");
	//Exercice 2.1 
		Car d = a;
		System.out.println(a==b);//false
		System.out.println(b==c);//false
		System.out.println(a==d);//true
		System.out.println(a.equals(b));//false
		System.out.println(b.equals(c));//true
		System.out.println(a.equals(d));//true
		//oui c'est natural parce que "==" c'est pour comparer le r¨¦f¨¦rence de deux instance
		//mais ici equals() c'est pour comparer le marques et le valeur
	
		//Exercice 2.2
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		//oui b et c sont equal et dans la liste il y a pas de voiture c donc index est -1
		
		//Exercice 2.3
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
		//oui parce que on a pas ajouter c dans le set donc le r¨¦sultat est false
	}

}
