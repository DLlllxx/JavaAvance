package td4;
/**
 * 
 * @author Linxin
 *
 */
public class Car {
	//exo1
	private final String brand;
	private final long value;
/**
 * exo2
 * Constructeur
 * @param b Brand 
 * @param v Value
 */
	public Car(String b,long v)
	{
		this.brand=b;
		this.value=v;
	}
	
	public String getBrand() {
		return brand;
	}
	public long getValue() {
		return value;
	}
/**
 * 	exo5
 * Affiche une voiture et ses caract¨¦ristiques
 */
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", value=" + value + "]";
	}
	
	public boolean equals(Car c) {
		return c.getBrand() == this.getBrand() && c.getValue() == this.getValue();
	}
	

	
	
	
	
	
	
	
}
