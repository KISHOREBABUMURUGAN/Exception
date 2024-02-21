package Exception_checked_exception;

import java.util.Scanner;

public class unchecked_various_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nums;
		System.out.println("Enter the dividend : ");
		nums=sc.nextInt();
try {
	int fun=10/nums;
}catch(ArithmeticException e) {
	System.out.println("Invalid input"); 
	e.printStackTrace();
	System.out.println(e.getMessage());
}
catch(IndexOutOfBoundsException e) {
	System.out.println("Invalid input"); 
	e.printStackTrace();
	System.out.println(e.getMessage());
}
catch(NullPointerException e) {
	System.out.println("Invalid input"); 
	e.printStackTrace();
	System.out.println(e.getMessage());
}
catch(NumberFormatException e) {
	System.out.println("Invalid input"); 
	e.printStackTrace();
	System.out.println(e.getMessage());
}
	}

}
