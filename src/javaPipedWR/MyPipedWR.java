package javaPipedWR;

import java.io.PipedReader;
import java.io.PipedWriter;

public class MyPipedWR {

	public static void main(String[] args) throws Exception {
		
	            PipedReader pipedReader = new PipedReader();  
	            PipedWriter pipedWriter = new PipedWriter(pipedReader); 
	            
	            char[] myChar = "Testing Piped WR has been completed.".toCharArray();
	  
	            Thread readerThread = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                        int i = 0;  
	                        while ((i = pipedReader.read()) != -1) {  
	                            System.out.print((char)i);  
	                        }  
	                    } catch (Exception ex) {  
	                    	//ex.printStackTrace();
	                    }  
	                }  
	            });  
	  
	            Thread writerThread = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                    	pipedWriter.write(myChar);  
	                    } catch (Exception ex) {  
	                    	ex.printStackTrace();
	                    }  
	                }  
	            });  
	            
	            readerThread.start();  
	            writerThread.start();  

	}

}
