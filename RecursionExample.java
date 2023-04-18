package Basics_java;

public class RecursionExample{
	public static int isfibo(int n) {
		if(n==0) {
			return 1;
		}return isfibo(n-1)+(n+2);
	}
	
	public static void main(String[] args) {
		// Another example of recursion..
		System.out.println(isfibo(5));
		int num = 100;
		for(int i = 2; i<=num; i++) {
			boolean isprime =true;
			for(int j = 2; j<i; j++) {
				if(i % j == 0) {
					isprime = false;
					break;
				}
			}if(isprime) {
				System.out.println(i);
			}
		}
	}

}
