public class Product {
	
	// Declaring common variables for a product.
	
	int itemID;
	String itemDescription;
	Double price;
	Double sellingPrice;
	int stockLevel;
	
	
	public Product(int itemID, String itemDescription, int stockLevel, Double price, Double sellingPrice) {
	}
    // Creating getters and setters.
	public int getItemID() {
		return itemID;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getStockLevel() {
		return stockLevel;
	}
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
	
	
}



