package org.tnsindia.generics;

public class GenericsClassExample<T> {
	T num;
	//method
	public void show()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instead of collections I have used Generics class name and generics comcept
				GenericsClassExample<Double>obj=new GenericsClassExample<>();
				obj.num=13.8;
				obj.show();

	}

}
