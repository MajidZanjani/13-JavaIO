package byteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayStream {

	public static void main(String[] args) throws Exception{
		// Writing a ByteArrayStream on two files.
		FileOutputStream f1 = new FileOutputStream("D:\\File1.txt");
		FileOutputStream f2 = new FileOutputStream("D:\\File2.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String string = "This is a sample string.";
		byte[] b = string.getBytes();
		baos.write(b);		
		baos.writeTo(f1);
		baos.writeTo(f2);		
		f1.close();
		f2.close();
		baos.flush();
		baos.close();
		System.out.println("End of writing on two files.\n");
		
		// Reading from a ByteArray
		System.out.println("ByteArray content is:");
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		int i = 0;
		while ((i = bais.read()) != -1) {
			System.out.print((char)i);
		}
		
		bais.reset();		
		System.out.println("\n\nThe char codes of above string are as bellow:");
		i = 0;
		while ((i = bais.read()) != -1) {
			System.out.print(i + " ");
		}		

	}

}
