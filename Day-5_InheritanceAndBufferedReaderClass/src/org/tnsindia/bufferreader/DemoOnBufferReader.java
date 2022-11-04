package org.tnsindia.bufferreader;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoOnBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String str=r.readLine();
		System.out.println(str);


	}

}
