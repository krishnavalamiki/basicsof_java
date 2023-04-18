package Basics_java;

public class Statements_neseted {

	public static void main(String[] args) {
		// Nested if else ... if statement inside the if else statements is called nested if else
        int marks = 99;
        if(marks<25) {
        	System.out.println("student is failed..");
        } if(marks>25 && marks<45) {
        	System.out.println("student is just pass..");
        }else if(marks>45 && marks<75) {
        	System.out.println("student is pass avarage marks..");
        } else if(marks>75 && marks<80) {
        	System.out.println("student pass second class..");
        } else {
        	System.out.println("student is pass first class..");
        }
	}

}
