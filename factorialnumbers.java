package Basics_java;

public class factorialnumbers {
	

	public static void main(String[] args) {
		// factorial multipy first number and second number continue last term..
		int num = 5;
		int fact = 1; 
		for(int i = 1; i<=num; i++) {
			fact = fact *i;
		}
        System.out.println("factorial of 5 :"+fact);
	}

}
