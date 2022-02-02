package javaFileWriteAndRead;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriterAndReader {

	public static void main(String[] args) throws IOException {
		
		String file1 = "D:\\tmpJavaFiles\\file1.txt";
		FileWriter fileWriter = new FileWriter(file1);
		
		String msg = "Test file writer..";
		
		fileWriter.write(msg);
		fileWriter.close();
		
		FileReader fileReader = new FileReader(file1);
		
		int i = 0;
		
		while ((i = fileReader.read()) != -1) {
			System.out.print((char)i);;
		}
		fileReader.close();

	}

}
