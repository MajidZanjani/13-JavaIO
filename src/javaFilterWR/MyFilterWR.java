package javaFilterWR;

import java.io.*;

public class MyFilterWR {

	static class MyFilterWriter extends FilterWriter {
		MyFilterWriter(Writer out) {
			super(out);
		}
	    public void write(String str) throws IOException {  
	        super.write(str.toLowerCase());  
	    }  
	}
	
	static class MyFilterReader extends FilterReader {
		public MyFilterReader(Reader in) {
			super(in);
		}
	    public int read() throws IOException {  
	        int i = super.read();  
	        if ((char) i == 't')  
	            return ((int) '*');  
	        else  
	            return i;  
	    }  
	}
	
	public static void main(String[] args) throws Exception {
		String myFile = "D:\\tmpjavafiles\\file1.txt";
		try {
			FileWriter w1 = new FileWriter(myFile);
			MyFilterWriter myFW = new MyFilterWriter(w1);
			myFW.write("THIS IS A TEST FOR FILTER WRITER.");
			myFW.close();
			
			FileReader myFileReader = new FileReader(myFile);
			BufferedReader bf1 = new BufferedReader(myFileReader);
			int i = 0;
			while ((i = bf1.read()) != -1) {
				System.out.print((char)i);
			}
			bf1.close();
			
			System.out.println("\n\nEnd of FilterWriter. Starting FilterReader...\n\n");			
			
			Reader r1 = new FileReader(myFile);
			MyFilterReader myFR = new MyFilterReader(r1);
			while ((i = myFR.read()) != -1) {
				System.out.print((char)i);
			}
			myFR.close();
			r1.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
