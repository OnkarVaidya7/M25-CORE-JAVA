package org.tnsindia.finalkeyword;

class FinalMethod
{
	//Final Method cannot be overriden
	/*
	final void accept()
	{
		System.out.println("Final method cannot be override");
	}
	*/
}
class Child extends FinalMethod
{
	void accept()
	{
		System.out.println("Child Class");
	}
}

public class DemoOnFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.accept();

	}

}
