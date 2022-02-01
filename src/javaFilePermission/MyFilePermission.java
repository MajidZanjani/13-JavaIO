package javaFilePermission;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class MyFilePermission {

	public static void main(String[] args) throws IOException{
		String myFile = "D:\\tmpJavafiles\\file1.txt";
		
		FilePermission fp1 = new FilePermission("D:\\tmpJavafiles\\-", "read");
		FilePermission fp2 = new FilePermission(myFile, "write");
		
		PermissionCollection myPC1 = fp1.newPermissionCollection();
		myPC1.add(fp1);
		myPC1.add(fp2);
		
		if (myPC1.implies(new FilePermission(myFile, "read,write"))) {
			System.out.println("Read & Write access have been granted to " + myFile);
		} else {
			System.out.println("There's no Read & Write access for " + myFile);
		}
	}
		
}
