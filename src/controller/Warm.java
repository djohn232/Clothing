/**
 * Will print the clothing suggestions based on warm temperature range
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

public class Warm {

	public Warm(int temperature) {
		System.out.println("It's Warm Today!");
		System.out.println("\nNo Jacket Required");
		System.out.println("T-Shirt or Dress");
		System.out.println("Shorts, Capris, or a Skirt");
		System.out.println("Flip Flops, Slides, or Sneakers");
	}

}
