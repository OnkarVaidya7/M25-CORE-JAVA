package org.tnsindia.annotation;

class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Hey guys!");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Hurrah!");
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Parent1();
		p.print1();

	}

}
