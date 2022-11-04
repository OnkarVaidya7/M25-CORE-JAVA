package org.tnsindia.operator;
import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 2 number for arithmetic operation: ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		//All arithmetic operation 
		//Addition
		int add=num1+num2;
		//Subtraction
		int sub=num1-num2;
		//Multiplication
		int mul=num1*num2;
		//Division
		float div=num1/num2;
		//Modular
		int mod=num1%num2;
		
		System.out.println("Addition is: "+add);
		System.out.println("Subtraction is: "+sub);
		System.out.println("Multiplication is: "+mul);
		System.out.println("Division is: "+div);
		System.out.println("Modular is: "+mod);
		s.close();

	}

}
