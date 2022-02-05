package javaCharArrayRW;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyCharArrayRW {

	public static void main(String[] args) throws IOException {
		char[] chArray = {'C','h','a','r','A','r','r','a','y','R','W',' ','t','s','t'};
		CharArrayReader chReader = new CharArrayReader(chArray);
		int i = 0;
		while ((i = chReader.read()) != -1) {
			System.out.print((char)i);
		}
		chReader.close();

		CharArrayWriter chWriter = new CharArrayWriter();
		chWriter.write(chArray);
		
		FileWriter fileWriter = new FileWriter("D:\\tmpjavafiles\\file1.txt");
		
		chWriter.writeTo(fileWriter);
		
		fileWriter.close();
		chWriter.close();

	}

}
