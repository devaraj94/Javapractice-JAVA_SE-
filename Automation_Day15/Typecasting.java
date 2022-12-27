/**
Typecasting-conversion of one data type to another.
1.Upcasting-automatically java will take care of.
2.Downcasting-Explicitly you need to mention.

a.In a typeCasting boolean cannot be converted to any data type.
*/

public class Typecasting{
	
	public static void main(String args[]){
		
		double bigValue=25.545353234;
		int smallValue=21;
		
		smallValue=(int)bigValue;
		
		System.out.println("The smallValue is ...:" +smallValue);
		
		short shortValue=30;
		double bigValue2=20.493848327;
		
		bigValue2=shortValue;
		System.out.println("the bigValue2 is .....:" +bigValue2);
		
	}
}
