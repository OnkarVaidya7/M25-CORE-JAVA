package org.tnsindia.junit5demo;

import static org.junit.Assert.fail;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FirstJunit5Test {

	@Test
	//it will perform the testing on the method
	void test() {
		System.out.println("Hello everyone");
	}
	
	@Test
	@Disabled
	void display() {
		fail("hi");
	}

}
