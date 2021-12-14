package td4;

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
		garage.firstCarByBrand(garage);
	//Exercice 2 
		Car d = a;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
	}

}
