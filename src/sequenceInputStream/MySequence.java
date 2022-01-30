package sequenceInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MySequence {

	public static void main(String[] args) throws Exception {
		// First you have to make 4 files...
		try {	
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\File1.txt");
			String myString = "This is File1. ";
			byte[] b = myString.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();
			fileOutputStream = new FileOutputStream("D:\\File2.txt");
			myString = "This is File2. ";
			b = myString.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();	
			fileOutputStream = new FileOutputStream("D:\\File3.txt");
			myString = "This is File3. ";
			b = myString.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();	
			fileOutputStream = new FileOutputStream("D:\\File4.txt");
			myString = "This is File4.";
			b = myString.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// Then start to SequenceStreaming...		
		FileInputStream file1 = new FileInputStream("D:\\File1.txt");
		FileInputStream file2 = new FileInputStream("D:\\File2.txt");
		FileInputStream file3 = new FileInputStream("D:\\File3.txt");
		FileInputStream file4 = new FileInputStream("D:\\File4.txt");		
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(file1);
		vector.add(file2);
		vector.add(file3);
		vector.add(file4);
		Enumeration<FileInputStream> enumeration = vector.elements();
		SequenceInputStream bin = new SequenceInputStream(enumeration);
		
		// Start reading from the created sequence
		int i = 0;
		while ((i=bin.read()) != -1) {
			System.out.print((char)i);
		}
		
		bin.close();
		file1.close();
		file2.close();
		file3.close();
		file4.close();

	}

}
