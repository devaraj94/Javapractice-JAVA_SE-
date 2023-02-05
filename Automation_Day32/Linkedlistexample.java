/**
*LinkedList-each element under Linkedlist considered as Node , i.e Previous and Next of element.

*/
import java.util.*;
public class Linkedlistexample{
	
	public static void main(String [] args){
		
		List<Integer> linkedlistofnumbers=new LinkedList<>();
		
		linkedlistofnumbers.add(299);
		linkedlistofnumbers.add(200);
		linkedlistofnumbers.add(1, 400);
		linkedlistofnumbers.add(500);
		linkedlistofnumbers.add(100);
		
		List<Integer> linkedlistofnumbers2=new LinkedList<Integer>();
		
		linkedlistofnumbers2.add(400);
		linkedlistofnumbers2.add(500);
		
		linkedlistofnumbers2.addAll(linkedlistofnumbers);
		System.out.println("the Final available numbers : " +linkedlistofnumbers2);
		
		System.out.println("using contains function : "+linkedlistofnumbers2.contains(100));
		
		linkedlistofnumbers2.clear();
		
		System.out.println("after removing : " +linkedlistofnumbers2);
		}	
}
	
