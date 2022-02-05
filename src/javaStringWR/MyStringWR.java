package javaStringWR;

import java.io.FileReader;
import java.io.StringReader;
import java.io.StringWriter;

public class MyStringWR {
	
	public static void main(String[] args) throws Exception{
		
		String fileName = "D:\\tmpjavafiles\\file1.txt";
		FileReader myFileReader = new FileReader(fileName);		
		
		StringWriter myStringWriter = new StringWriter();
		
		int i = 0;
		while ((i = myFileReader.read()) != -1) {
			myStringWriter.write((char)i);
		}
		myFileReader.close();
		
		String readString = myStringWriter.toString();
		
		StringReader myStringReader = new StringReader(readString);
		
		while ((i = myStringReader.read()) != -1) {
			System.out.print((char)i);
		}	
		
		// This is unnecessary to close StringWriter and StringReader.
		// Because they are not using network sockets or files.
				
	}

}
