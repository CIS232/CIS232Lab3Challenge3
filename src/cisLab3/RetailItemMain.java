package cisLab3;

import java.util.Scanner;

public class RetailItemMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int numItems;
		int userInput; 
		String description=""; 
		int units=0; 
		double price=0;
		int items=0;
		RatailItem r = new RatailItem();
		
	try 
	{
		
		while(items < 3){
			try {
			
		System.out.print("Enter description:" );
		r.setDescription(description=keyboard.nextLine());
		items++;
		System.out.print("Enter units on hand:" );
		r.setUnitsOnHand(units=keyboard.nextInt());
		items++;
	
		
		System.out.print("Enter the price: ");
		r.setPrice(price=keyboard.nextDouble());
		items++;
		
		
		if (units<0)
		{
			throw new IllegalArgumentException();
		}
		if (price<0)
		{
			throw new IllegalArgumentException();
		}
		
			}catch(IllegalArgumentException e)
			 {
					System.out.println("Negative numbers not allowed. Try again. ");
					keyboard.next();
			 }
		}
		System.out.println("\nDescription \t Units on Hand \t Price");
		System.out.println("_______________________________________________");
		System.out.println("Item:"+description+ "\t\t"+ units+ "\t  $"+ price);
		
	} finally{
		System.exit(0);
		
	}
	}
}
