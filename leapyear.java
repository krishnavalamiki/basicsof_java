package Basics_java;

public class leapyear {
	static boolean isleap(int year) {
		if(year%4==0 || year %100 == 0 && year%100==0) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
		// Given year leap year (or) not..
		System.out.println(isleap(2020));
	}
}
