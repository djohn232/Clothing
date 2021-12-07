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
import controller.HeapSort;
import java.util.LinkedList;
import java.util.Queue;

public class ClothingDriver {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
		int heapArray[] = {45,32,60,90,75};
        int length = heapArray.length;

		HeapSort ob = new HeapSort();
        ob.sort(heapArray);
        
		System.out.println("Hello, I am here to help you decide what to wear based on the current weather outside.");
		
		System.out.println("\nThe following are the most common temperatures from each of my clothing categories:");
       
        for (int i = 0; i < length; ++i) {
            System.out.print(heapArray[i] + " ");
        }
        
        Queue<String> clothingQ = new LinkedList<>();
        
        clothingQ.add("Scorching");
        clothingQ.add("Warm");
        clothingQ.add("Cool");
        clothingQ.add("Cold");
        clothingQ.add("Freezing");

        System.out.println("\nThe following clothing categories will be used: " + clothingQ);
      		
		System.out.println("\nWould you like me to tell you what to wear? Enter Yes/No");
		String userAnswer = in.nextLine();
		
		if (userAnswer.equals("yes") || userAnswer.equals("Yes")) {

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
			} else { 
				System.out.println("Please try again!");
			}
		} 
		else if (userAnswer.equals("no") || userAnswer.equals("No")) {
			System.out.println("Goodbye!");
		}		
	}
}
