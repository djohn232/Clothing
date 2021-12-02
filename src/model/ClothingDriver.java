/**************************************************************
 * Name       : Clothing Based on Temperature   
* Author      : Delanie Johnson
* Created     : 11/01/2021
* Course      : CIS 152 Data Structures
* Version     : 2.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program will suggest outfit selections based on the temperature 
*               Input:  user will enter range of temps
*               Output: shows temp and clothing suggestion based on user response
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
//Temperature Ranges:  
//90 - 100+ - HOT
//70 - 89 - WARM
//50 - 69 - COOL
//33 - 49 - COLD
//32 - 0 (and less) - FREEZING

package model;

import java.util.Scanner;
import controller.Scorching;
import controller.Warm;
import controller.Cool;
import controller.Cold;
import controller.Freezing;

public class ClothingDriver {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
		
		System.out.println("Hello, I am here to help you decide what to wear based on the current weather outside.");
		System.out.println("\nWould you like me to tell you what to wear? Enter Yes/No");
		
		String userAnswer = in.nextLine();

		while (userAnswer.equals("yes") || userAnswer.equals("Yes")) {
		
		System.out.println("Please enter the temperature outside (in Fahrenheit, rounded to the closest whole number:");
		
		int userTemp = in.nextInt();
		
		if (userTemp >= 90) {
			Scorching scorching = new Scorching(userTemp);
		}
		else if (userTemp >= 70 || userTemp <= 89) {
			Warm warm = new Warm(userTemp);
		}
		else if (userTemp >= 50 || userTemp <= 69) {
			Cool cool = new Cool(userTemp);
		}
		else if (userTemp >= 33 || userTemp <= 49) {
			Cold cold = new Cold(userTemp);
		}
		else if (userTemp  <= 32) {
			Freezing freezing = new Freezing(userTemp);
		}
		
		System.out.println("\nWould you like me to tell you what to wear? Enter Yes/No");
		 userAnswer = in.nextLine();

		}
		
		System.out.println("Goodbye!");
		in.close();
		
	}
}
