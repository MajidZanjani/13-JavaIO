package javaConsole;

import java.io.Console;

public class MyjavaConsole {

	public static void main(String[] args) {
		
		//
		// Try to run this from terminal if console returns null.
		// javac MyjavaConsole.java
		// java MyjavaConsole.java
		//
		
		Console console = System.console();
		
		System.out.print("Enter your password: ");
		char[] chars = console.readPassword();
		String pass = String.valueOf(chars);
		
		System.out.println("Your password is " + pass);

	}

}
