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
	  String target;
	  String message;
	  
	  if (args.length >0) {
	    target=args[0];
	  } else {
	    target="World"; }
	   
	  message=String.format("Hello %s!", target);
	  
		// TODO Auto-generated method stub
		emitMessage(message);
		for (int i = 1; i <args.length; i++) {
		  System.out.printf("Arg # %d %s%n", i, args[i]);
	}

}

private static void emitMessage(String message) { 
  System.out.println(message);
}
}