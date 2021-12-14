package td4;

public class Bike {
	private final String brand;
	private final long value = 100;
	private final Discount discount;
	
	public Bike(String brand, Discount d) {
		this.brand = brand;
		this.discount = d;
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}

}
