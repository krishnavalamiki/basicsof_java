package Basics_java;

public class Recursion {
	public static int isfact(int fact) {
		if(fact==1) {
			return 1;
		}return isfact(fact-1)*fact;
		
	}

	public static void main(String[] args) {
		// function calls iteslef is called recursion..
		System.out.println(isfact(5));
         
	}

}
