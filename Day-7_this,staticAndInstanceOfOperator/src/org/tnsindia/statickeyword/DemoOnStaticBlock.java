package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {
	
	static int a=10;
	//int b=20
	static int b;
	//static block used to initialize static data members
	static 
	{
		//we can't use non static variable inside the static block
		b=a+50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of a : "+a);
		System.out.println("Value of a : "+b);

	}

}
