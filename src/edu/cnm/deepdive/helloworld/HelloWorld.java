package edu.cnm.deepdive.helloworld;
/**
 * Simple class that displays the "Hello World!!!" message.
 * @author User
 */
public class HelloWorld {
/**
 * Prints "Hello World!!!" to standard output.
 * 
 * @param args    Command-line parameters (ignored)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emitMessage("Hello World!!!");
	}


private static void emitMessage(String message) { 
  System.out.println(message);
}
}