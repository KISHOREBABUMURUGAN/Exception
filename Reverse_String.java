package javapackage;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
Scanner sc=new Scanner (System.in);
System.out.println("Enter your name !! : ");
name=sc.next();
for(int i=name.length()-1;i>=0;i--) {
	System.out.print(name.charAt(i));
}
	}

}
