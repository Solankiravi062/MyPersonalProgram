
public class DreamCar {

	private String name;
	private String color;
	private double price;
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "DreamCar [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	public DreamCar(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
}
