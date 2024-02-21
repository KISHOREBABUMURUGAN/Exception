package javapackage;
import java.util.Scanner;
public class Sumof_oddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter a limit : " );
  int nums=sc.nextInt();
  int sum=0;
  for(int i=1;i<=nums;i++) {
	  if(i%2!=0) {
		  sum=sum+i;
		 
	
	  }
	
  }
  System.out.print(sum);
	}

}
