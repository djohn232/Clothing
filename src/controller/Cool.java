/**
 * Will print the clothing suggestions based on cool temperature range
 * @author Delanie Johnson
 * @version
 */

package controller;

//Temperature Ranges:  
//90 - 100+ - HOT
//70 - 89 - WARM
//50 - 69 - COOL
//33 - 49 - COLD
//32 - 0 (and less) - FREEZING

public class Cool {
	
	public Cool (int temperature) {
		System.out.println("It's Cool Today!");
		System.out.println("\nA Light Jacket or Wind Breaker");
		System.out.println("Long Sleeve T-Shirt or Sweater");
		System.out.println("Jeans or Sweatpants");
		System.out.println("Sneakers");
	}


}
