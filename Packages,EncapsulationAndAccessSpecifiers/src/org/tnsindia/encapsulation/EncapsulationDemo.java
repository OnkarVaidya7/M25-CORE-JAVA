package org.tnsindia.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC();
		//setting the value using setters method
		h.setPin_no(1001);
		

		//returning the output using getters method
		System.out.println("The pin of atm is: "+h.getPin_no());

	}

}
