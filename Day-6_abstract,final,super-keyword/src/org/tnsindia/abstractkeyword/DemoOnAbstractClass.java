package org.tnsindia.abstractkeyword;

abstract class C
{
	//Abstract class can have abstract and non abstract method
	//non abstract method
	void print()
	{
		System.out.println("The abstract method ");
	}
	abstract void display();
	abstract void accept();
	
}
/*we can't create the object for abstract class to call the method and to provide
the implementation we must define child class*/
class D extends C
{
	//we have to provide implementation to all the abstract methods
	@Override
	void display() {
		System.out.println("Abstract method 1");
		
	}

	@Override
	void accept() {
		System.out.println("Abstract method 2");
		
	}
	
	
}

public class DemoOnAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new D();
		c.print();
		c.display();
		c.accept();

	}

}
