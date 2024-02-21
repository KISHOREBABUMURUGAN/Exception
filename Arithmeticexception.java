package Exception_unchecked_exception;

import java.util.Scanner;

public class Arithmeticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nums;
		nums=sc.nextInt();

		int fun=10/nums;
		System.out.println(fun);  //0 brings arithmetic exception
	}

}
