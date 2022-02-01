package fileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileIOStream {

	public static void main(String[] args) {
		
		// Writing to the file
		try {	
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\testFile.txt");
			String myName = "Majid Zanjani";
			byte[] b = myName.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();			
			System.out.println("File has been written successfully.\n");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// Reading from that file
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\\\testFile.txt");
			int i = 0;
			System.out.println("Reading the file content...\n");
			while ((i=fileInputStream.read()) != -1) {
				System.out.print((char)i);
			}
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
