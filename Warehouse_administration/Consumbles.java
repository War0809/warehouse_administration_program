// Creating a class for consumbles extending the Product class.
public class Consumbles extends Product {
	// Declaring variables to extend those in the Product class.
	Double capacity;
	String measuringUnits;
	
	public Consumbles(int itemID, String itemDescription, int stockLevel, Double price, Double sellingPrice, Double capacity, String measuringUnits) {
		super(itemID, itemDescription, stockLevel, price, sellingPrice);
	}
	
	// Creating the getters and setters.
	public Double getCapacity() {
		return capacity;
	}
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}
	public String getMeasuringUnits() {
		return measuringUnits;
	}
	public void setMeasuringUnits(String measuringUnits) {
		this.measuringUnits = measuringUnits;
	}
	
	
}




	


