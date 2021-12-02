/**
 * Will print the clothing suggestions based on freezing temperature range
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

public class Freezing {
	
	public Freezing (int temperature) {
		System.out.println("It's Freezing Today!");
		System.out.println("\nHeavy Duty Jacket with Mittens");
		System.out.println("Several Sweaters or Layers");
		System.out.println("Snow Pants and Thermal Leggings");
		System.out.println("Heavy Duty Boots");
	}

}
