package bufferedIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyBufferedIOStream {

	public static void main(String[] args) throws Exception {
		
		// Writing 
		FileOutputStream myFO = new FileOutputStream("D:\\MyTextFile.txt");
		BufferedOutputStream myBfO = new BufferedOutputStream(myFO);
		
		String myString = "This is an example for buffered output and input stream.";
		byte[] b = myString.getBytes();
		myBfO.write(b);
		
		myBfO.flush();
		myBfO.close();
		myFO.close();
		System.out.println("Writing succeed!");
		
		// Reading
		FileInputStream myFI = new FileInputStream("D:\\MyTextFile.txt");
		BufferedInputStream myBFI = new BufferedInputStream(myFI);
		
		int i = 0;
		while ((i = myBFI.read()) != -1) {
			System.out.print((char)i);
		}
		
		myBFI.close();
		myFI.close();	
		
	}

}
