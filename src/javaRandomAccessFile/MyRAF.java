package javaRandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRAF {

	// First make this file in the path.
    static final String FILEPATH ="D:\\tmpjavafiles\\testforRAF.txt"; 
    
     private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }     
    
    public static void main(String[] args) {  
        try {  
        	
        	// readFromFile(FILEPATH, cursor position, bytes)
            System.out.println(new String(readFromFile(FILEPATH, 0, 15)));  
            
            // writeToFile(FILEPATH, contect, cursor position);  
            writeToFile(FILEPATH, "This is a random access WR example.", 0);  
        
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

    
}
