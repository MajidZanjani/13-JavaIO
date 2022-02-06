package javaScanner;

import java.util.Scanner;

public class MyScannerClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your info using this format:\n\nFirstName-LastName-Age\n");
		String str = scanner.nextLine();
		
		Scanner formatScanner = new Scanner(str);
		formatScanner.useDelimiter("-");
		
		while (formatScanner.hasNext()) {
			System.out.println(formatScanner.next());
		}
			
		formatScanner.close();
		scanner.close();

	}

}
