package Exception_unchecked_exception;
import java.util.Scanner;
public class Indexbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the limit : ");
		n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the number : ");
   int nums=sc.nextInt();
   System.out.println("Enter the position : ");
   int pos=sc.nextInt();
    a[pos]=nums;
   
  System.out.println(a); 
	}

}
