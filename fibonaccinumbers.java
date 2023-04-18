package Basics_java;

public class fibonaccinumbers {

	public static void main(String[] args) {
		// write a program print the palindrome numbers..
		int f = 1, s = 1, t ;
		int num = 5;
		for(int i = 0; i<=num; i++) {
			t = f+s;
			f=s;
			s = t;
			System.out.println(t);
		}
	}
}
