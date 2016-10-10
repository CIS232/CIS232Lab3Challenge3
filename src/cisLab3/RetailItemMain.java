package cisLab3;

import java.util.Scanner;

public class RetailItemMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numItems;
		int userInput;
		String description = "";
		int unitsOnHand = 0;
		double price = 0;
		int items = 0;

		try {

			RatailItem r = new RatailItem();
			{

				try {
					boolean valid = false;

					while (!valid) {

						System.out.print("Enter description:");
						r.setDescription(description = keyboard.nextLine());

						while (!valid) {
							try {

								System.out.print("Enter units on hand:");
								r.setUnitsOnHand(unitsOnHand = keyboard.nextInt());
								valid = true;

							} catch (Exception e) {

								System.out.println("Invalid number must be positive. ");
							}
						}
						
							valid=false;
							
						while (!valid) {
							try {

								System.out.print("Enter the price: ");
								r.setPrice(price = keyboard.nextDouble());
								valid = true;

							} catch (Exception e) {
								System.out.println("Invalid number must be positive. ");
							}
						}

						items++;
					}
				} catch (IllegalArgumentException e) {
					System.out.println("Negative numbers not allowed. Try again. ");
					keyboard.nextLine();
				}
			}
			System.out.println("\nDescription \t Units on Hand \t Price");
			System.out.println("____________________________________________");
			System.out.println(r);

		} finally {
			System.exit(0);

		}
	}
}
