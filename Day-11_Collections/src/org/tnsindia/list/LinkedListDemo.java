package org.tnsindia.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total no os values to be shuffled: ");
		int x=s.nextInt();
		while(x!=0)
		{
			list.add(s.nextInt());
			x--;
		}
		//this shuffle method is used to shuffle list
		Collections.shuffle(list);
		System.out.println(list);

	}

}