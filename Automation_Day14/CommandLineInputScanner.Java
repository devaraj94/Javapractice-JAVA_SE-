import java.util.Scanner;

public class CommandLineInputScanner{
	
	public static void main(String arryArgs[]){
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("My name is ..." );
		String myName=scr.nextLine();
		
		System.out.println("My age is ...");
		int myAge=scr.nextInt();
			
		System.out.println("My height is ...");
		float myHeight=scr.nextFloat();
			
		System.out.println("I am secured totalmarks in examination ...");	
		int totalmarks=scr.nextInt();
		
		System.out.println("gender is ...");
		char gender=scr.next().charAt(0);

        System.out.println("My mobile number is ...");
		long mobileNum=scr.nextLong();
			
		System.out.println("My place is ......");
		char myPlace=scr.next().charAt(0);	

	}
	
}
