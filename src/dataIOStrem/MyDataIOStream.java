package dataIOStrem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyDataIOStream {

	public static void main(String[] args) throws Exception{
		// Writing Data into file
		String myString = "DataOutputStream Testing";
		System.out.println("Writing myString (" + myString + ") into File1.txt...");
		FileOutputStream fileOut = new FileOutputStream("D:\\File1.txt");
		DataOutputStream dos1 = new DataOutputStream(fileOut);
		
		dos1.writeBytes(myString);
		
		dos1.flush();
		dos1.close();
		fileOut.close();
		System.out.println("myString has been written on File1.txt successfully.\n");
		
		// Reading Data from file
		System.out.println("Reading back myString from File1.txt...");
		FileInputStream fileIn = new FileInputStream("D:\\File1.txt");
		DataInputStream dis1 = new DataInputStream(fileIn);
		int byteCount = fileIn.available(); // returns content's byte count of the file
		byte[] byteArray = new byte[byteCount];
		
		dis1.read(byteArray);
		
		for (byte b: byteArray) {
			System.out.print((char)b);
		}		
		dis1.close();
		fileIn.close();		
		System.out.println("\nmyString has been read from File1.txt successfully.");

	}

}
