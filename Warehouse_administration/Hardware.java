// Creating Hardware class extending the Product class.
public class Hardware extends Product {
	// Declaring variables to extend those in the Product class.
	Double weight;
	int length;
	int width;
	int height;
	
	public Hardware (int itemID, String itemDescription, int stockLevel, Double price, Double sellingPrice, Double weight, int length, int width, int height) {
		super(itemID, itemDescription, stockLevel, price, sellingPrice);
		
	}
	// Creating getters and setters.	 
	Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

