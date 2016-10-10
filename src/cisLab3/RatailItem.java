package cisLab3;

public class RatailItem
{
 private String description; 
 private int unitsOnHand; 
 private double price;
 

 public void setDescription(String description) {
		this.description = description;
	}
public String getDescription() {
	return description;
}

public void setUnitsOnHand(int unitsOnHand) {
	this.unitsOnHand = unitsOnHand;
	if (unitsOnHand<0)
	{
		throw new IllegalArgumentException();
	}
}
public int getUnitsOnHand() {
	return unitsOnHand;
}

public void setPrice(double price) {
	this.price = price;
	if (price<0)
	{
		throw new IllegalArgumentException();
	}
} 
public double getPrice() {
	return price;
}

public String toString()
{
	return String.format("Item:%2s%10s%12s", description, unitsOnHand, (double)price );
}

}
