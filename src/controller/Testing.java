package controller;
import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.ClothingDriver;

class Testing {

	@Test
	void testInt() {
		int userTemp = 23;
		assertEquals(23,23);
	}
	
	@Test
	void testDouble() {
		double userTemp = 23.33;
		assertEquals(23.33,23);
	} 

}
