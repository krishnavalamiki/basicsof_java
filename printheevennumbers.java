package Basics_java;

public class printheevennumbers {

	public static void main(String[] args) {
		// given a program print the even numbers from 1 to 100..
		int num = 100;
		for(int i = 0; i<=num; i++) {
	        if(i%2==0) {
	        	System.out.println(i);
	        }
		}
	}
}
