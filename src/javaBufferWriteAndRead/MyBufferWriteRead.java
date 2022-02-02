package javaBufferWriteAndRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferWriteRead {

	public static void main(String[] args) throws IOException {
		
		String fileName = "D:\\tmpjavafiles\\file1.txt";
		FileWriter fileWriter = new FileWriter(fileName);
		BufferedWriter bfw1 = new BufferedWriter(fileWriter);		
		bfw1.write("Buffer Writer test...");
		bfw1.close();
		fileWriter.close();
		System.out.println("Buffer write succeeded!");
		
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bfr1 = new BufferedReader(fileReader);
		int i = 0;
		while ((i = bfr1.read()) != -1) {
			System.out.print((char)i);
		}
		bfr1.close();
		fileReader.close();		
		
	}

}
