package javaPushBackStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class MyPushBack {

	public static void main(String[] args) throws Exception {
		String myString = "Thi*s is* a test ****for Pu***shBack.";
		byte[] byteArray = myString.getBytes();
		
		ByteArrayInputStream bai = new ByteArrayInputStream(byteArray);
		
		PushbackInputStream pbis = new PushbackInputStream(bai);
		
		int i = 0;
		
		while ((i = pbis.read()) != -1) {
			if (i == '*') {
				int j = 0;
				while ((j = pbis.read()) == '*') {}
				pbis.unread(j); // Unread the last j
			} else {
				System.out.print((char)i);
			}
		}
		

	}

}
