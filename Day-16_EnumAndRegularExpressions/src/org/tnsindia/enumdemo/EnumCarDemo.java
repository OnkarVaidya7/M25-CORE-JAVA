package org.tnsindia.enumdemo;

public class EnumCarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accessing enum constants
				//Car r1=Car.TESLA;
				//System.out.println(r1);
				
				//using enhanced for loop
				for(Car c:Car.values())
				{
					//System.out.println(c.MARUTI);
					System.out.println(c);
				}

	}

}
