 public class singlelevelInheritance{

	 public static void main (String args[]){
	
		calcVeryAdv  c1=new calcVeryAdv();
		int result1=c1.add(4,5);
		int result2=c1.sub(50,22);
		int result3=c1.multiply(30,30);
		
		System.out.println("addition of two numbers:  "+result1);
		System.out.println("Substraction of two numbers:  "+result2);
		System.out.println("Multiplication of two numbers:  "+result3); 
		}
 }
 
class calcA{
public int add(int i,int j){
return i+j;
}
 }
 
 class calcAdvance extends calcA{ 
	 public int sub(int i,int j){
		 return i-j; 
	 }
 }
 
 class calcVeryAdv extends calcAdvance{
	 public int multiply(int i,int j){	 
		 return i*j; 
	 } 
 }
	 
 
	 