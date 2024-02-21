package Exception_checked_exception;

public class Nullpointer_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=null;
try {
	System.out.println(s.length());
}catch(NullPointerException e){
	System.out.println("its null");
	//e.printStackTrace();
}

	}

}
