package org.tnsindia.junit5demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public interface LifeCycleMethodDemo {
	
	@Test
	default void display()
	{
		System.out.println("M25 batch");
	}
	@Test
	@BeforeAll
	default void print()
	{
		System.out.println("BeforeAll annotation executed before all the testcases");
	}
	@Test
	@AfterEach
	default void accept()
	{
		System.out.println("AfterEach annotation executed After each testcases");

	}

}
