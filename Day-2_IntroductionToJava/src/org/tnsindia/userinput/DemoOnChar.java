package org.tnsindia.userinput;
import java.util.Scanner;
//Program for testing character
public class DemoOnChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Character: ");
		char a=s.next().charAt(2);
		System.out.println("The Character at 2nd index is: "+a);
		s.close();
	}

}
