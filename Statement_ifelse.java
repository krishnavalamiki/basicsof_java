package Basics_java;

public class Statement_ifelse {

	public static void main(String[] args) {
		// if else statements .. if else statement check the condition boolean express if true the statements executes the statements
		
		String s ="krishna";
		if(s.contains(s)) {
			System.out.println("Yes! s character is present..");  // first check the condition and if it is true then executes the statements..
		} else { 
			System.out.println("No ! s character is not present..");
		}
		
		if(s.contains("m")) {
			System.out.println("Yes! m charcter is present..");
		} else {
			System.out.println("No m charcter is not present.."); // express boolean if true execute statement false not executes..
		}
	}
}
