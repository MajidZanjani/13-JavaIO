package javaFile;

import java.io.File;
import java.util.Iterator;

public class MyFile {

	public static void main(String[] args) {
		String file1URI = "D:\\tmpjavafiles\\testFile1.txt";
		String file2URI = "D:\\tmpjavafiles\\file1.txt";
		File myDir = new File("D:\\tmpjavafiles");
		
		try {
			File myFile1 = new File(file1URI);
			File myFile2 = new File(file2URI);
			
			if (myFile1.createNewFile()) {
				System.out.println(file1URI + " has been created.");
				myFile1.setWritable(true);
			} else {
				System.out.println(file1URI + " is allready existed.");
				myFile1.setWritable(true);
			}
			
			if (myFile2.createNewFile()) {
				System.out.println(file2URI + " has been created.");
			} else {
				System.out.println(file2URI + " is allready existed.");
			}
			
			File files[] = myDir.listFiles();
			for (File file: files) {
				System.out.println(file.getName() + " canWrite: " + file.canWrite() + " size: " + file.length());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
