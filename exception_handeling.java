import java.util.Scanner;


public class exception_handeling {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter first number");
	    int a =sc.nextInt();
	    System.out.println("enter second number");
	    int b= sc.nextInt();
	  try{  int c=a/b;
	    System.out.println(c);
	   }catch(Exception e){
		   System.out.println(e);
		   System.out.println("Enter the number");
		    int d =sc.nextInt();
		    int c=a/d;
		    System.out.println(c);
	   }
	  finally{
		  System.out.println("finish....");
	  }
	}

}
