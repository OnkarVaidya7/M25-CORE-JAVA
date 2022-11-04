package org.tnsindia.annotation;

class Parent
{
	void eatFood()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	@Override
	void eatFood()
	{
		System.out.println("Child class");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c=new Child();
		c.eatFood();

	}

}
