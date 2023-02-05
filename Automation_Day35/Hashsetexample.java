//SET-does not allow duplicate elements.
// SET- makes no guarantees as to the iteration order of the set

import java.util.*;
public class Hashsetexample{
	
	public static void main(String[]  args){
		
	Set<Integer> hashset1=new HashSet<Integer>(); //hashset1

	hashset1.add(100);
	hashset1.add(200);
	hashset1.add(300);
	hashset1.add(700);
	hashset1.add(300); //duplicate element included
	System.out.println("Hashset 1 : " +hashset1);

	Set<Integer> hashset2=new HashSet<Integer>(); //hashset2
	
	hashset2.add(400);
	hashset2.add(500);
	hashset2.add(600);
	hashset2.add(450);
	System.out.println("Hashset 2 : " +hashset2);	
	
	hashset2.addAll(hashset1);
	System.out.println("adding Hashset1 to the hashset2 ,and the result is " +hashset2); //adding two hashsets
	
	Iterator iterator=hashset2.iterator();
	while(iterator.hasNext()){
	System.out.println("Iterate over the Hash set:"+iterator.next());
	}

	}
}