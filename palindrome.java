package javapackage;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int nums;
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
nums=sc.nextInt();
int reverse=0,rem;
while(nums!=0) {
	rem=nums%10;
	reverse=(reverse*10)+rem;
			nums=nums/10;
}
System.out.println(reverse);
	}

}
