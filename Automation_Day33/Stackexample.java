/** Stack-Last In First Out.(LIFO)


*/
import java.util.*;

public class Stackexample{
	
	public static void main(String[] args){
		Stack<String> fruits=new Stack<String>();
		fruits.push("mango");
		fruits.push("banana");
		fruits.push("promogranate");
		fruits.push("apple");
		fruits.push("Orange");
		
		System.out.println("Intial stack :" +fruits);
		
		String removedFruit=fruits.pop();
		
		System.out.println("removed fruit from stack :" +removedFruit);
		
		String topFruit=fruits.peek();
		System.out.println("top fruit from stack :" +topFruit);
		
}}