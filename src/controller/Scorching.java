/**
 * Will print the clothing suggestions based on scorching temperature range
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

public class Scorching {

	public Scorching() {
		super();
	}
	
	public Scorching (int temperature) {
		System.out.println("It's Scorching Today!");
		System.out.println("\nNo Jacket Required");
		System.out.println("Tank Top or Dress");
		System.out.println("Shorts or a Skirt");
		System.out.println("Flip Flops or Slides");
	}
}
