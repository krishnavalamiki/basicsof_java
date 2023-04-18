package Basics_java;

public class printprimenumbers {

	public static void main(String[] args) {
		// the given program print the prime numbers from 1 to 100..
	   int num = 100;
	   for(int i = 2; i<=num; i++) {
		   boolean isprime = true;
		   for(int j = 2; j<i; j++) {
			   if(i%j == 0) {
				   isprime = false;
				   break;
			   }
		   }
		   if(isprime) {
			   System.out.println(i);
		   }
	   }
	}
}
