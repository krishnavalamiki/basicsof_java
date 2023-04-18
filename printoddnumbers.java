package Basics_java;

public class printoddnumbers {

	public static void main(String[] args) {
		// given a program print the odd numbers from 1 t0 100.
		int num = 100;
		int i = 0;
		while(i<=num) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
