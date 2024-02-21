package Exception_checked_exception;

import java.util.Scanner;

public class try_catch_finally {

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
}finally {
	System.out.println("Its complete");
}
	}

}
