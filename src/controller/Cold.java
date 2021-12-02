/**
 * Will print the clothing suggestions based on cold temperature range
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

public class Cold {
	
	public Cold (int temperature) {
		System.out.println("It's Cold Today!");
		System.out.println("\nHeavy Jacket or Winter Coat");
		System.out.println("Sweater or Layered Shirts");
		System.out.println("Jeans, Sweatpants, or Leggings");
		System.out.println("Sneakers or Boots");
	}

}
