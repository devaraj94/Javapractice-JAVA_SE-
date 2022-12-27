public class Shiftoperators{
	
	public static void main(String args[]){
		
		int num3=60; 
		int num4=40;
		
		//Integer to binary
		System.out.println("Binary of 60 is " + Integer.toBinaryString(+num3)); //111100

        System.out.println("Binary of 40 is " + Integer.toBinaryString(+num4)); //101000
		
		
		//00111100
		//Two types of ShiftOperator is 
		//  1)Left shift operator <<
		//  2)Right shift operator >>
		
        //Binary to Integer 
		System.out.println(Integer.parseInt("00111100",2));  


		
		System.out.println(num3<<2);
		
		System.out.println(num4>>2);
		

	
         
}}  


	
