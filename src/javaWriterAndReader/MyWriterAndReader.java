package javaWriterAndReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class MyWriterAndReader {

	public static void main(String[] args) {
		try {
			String myFileUrl = "D:\\tmpJavafiles\\file1.txt";
			
			Writer writer = new FileWriter(myFileUrl);
			String toWriteString = "This is the content!";
			writer.write(toWriteString);
			writer.close();
			System.out.println("Writing has been done.. Now reading from it... \nThe content of file is:");

			Reader reader = new FileReader(myFileUrl);
			int read = 0;
			while ((read = reader.read()) != -1) {
				System.out.print((char)read);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
