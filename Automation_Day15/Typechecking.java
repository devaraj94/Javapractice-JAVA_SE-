public class Typechecking{
	
	public static void main(String args[]){
		
		int integerVal=65; //ASCII value of A 
		float bigVal=20;
		char charVal='A';
		char charVal2='Z';
		int smallVal=charVal;
		
		charVal=(char)integerVal;
		System.out.println("Char value is ..." +charVal);
		
		int integerVal2=90;
		charVal2=(char)integerVal2;
		System.out.println("Char value2 is ..." +charVal2);
	}
}
