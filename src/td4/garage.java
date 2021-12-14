package td4;
/**
 * 
 * @author Linxin
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class garage {
	private ArrayList<Car> g;
	private static int id;

	public garage()
	{
		this.g= new ArrayList<Car>();
		id++;
	}
/**
 * exo6
 * Ajoute une voiture dans le garage mais ne peut pas ajouter une voiture null 
 * @param c
 * @return
 */
	public ArrayList<Car> add(Car c)
	{
		Objects.requireNonNull(c, "car must not be null");
		this.g.add(c);
		return this.g;
	}
	
//exo7
	public static int getId() 
	{
		return id;
	}
/**
 * exo8
 * Affiche un garage
 */
@Override
	public String toString() 
	{
		return "garage [g=" + g + "]";
	}

/**
 * exo9
 * @return la valeur totale de garage
 */
	public long sommeValeur()
	{
		long somme =0;
		Iterator<Car> it = g.iterator();
		while(it.hasNext())
		{
			Car i = it.next();
			somme = somme+i.getValue();
		}
			return somme;
	}
/**
 * exo10
 * Retourne la premi¨¨re voiture de la marque
 * @param garage
 * @return la premi¨¨re voiture
 */
public Car firstCarByBrand(String brand)
{
	for (Car v : g) {
		 if (v.getBrand().equals(brand)) {
			 System.out.println(v.toString());
			 return v;
		 }	                
	 }
	 throw new NoSuchElementException();
}
public ArrayList<Car> getG() {
	return g;
}
public void setG(ArrayList<Car> g) {
	this.g = g;
}
public static void setId(int id) {
	garage.id = id;
}
public boolean equals(garage g) {
	return this.g.equals(g);
}
}