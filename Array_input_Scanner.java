package javapackage;
import java.util.Scanner;
public class Array_input_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int nums;
        System.out.println("Enter the limit : ");
        nums=sc.nextInt();
        
      int a[]=new int [nums];
      for(int i=0;i<nums;i++)
      {
    	  System.out.println("Enter the ["+i+"] number : ");
    	  a[i]=sc.nextInt();
      }
      for(int element:a) {
    	  System.out.print(element);
      }
        
	}

}
