package org.tnsindia.junit5demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class DynamicTestDemo<DynamicTest> {
	

	//dynamic Test
		@TestFactory
		Collection<DynamicTest>print()
		{
			Collection<DynamicTest> asList = (Collection<DynamicTest>) Arrays.asList(dynamicTest("Simple Dynamic Test",()->assertTrue(true)),
					dynamicTest("My Executable class",new  MyExecutableDynamicTestDemo())
					);
			return asList;
		}

	}

	class MyExecutableDynamicTestDemo implements Executable
	{

		@Override
		public void execute() throws Throwable {
			System.out.println("Welcome to M25 Batch");
			
		}

}
