import java.util.*;
public class Linkedhashtexample{
	
	public static void main(String[]  args){
		
	Set<Integer> linkedhashset1=new  LinkedHashSet<Integer>(); //linkedhashset1

	linkedhashset1.add(100);
	linkedhashset1.add(200);
	linkedhashset1.add(300);
	linkedhashset1.add(700);
	linkedhashset1.add(300); //duplicate element included
	System.out.println("Linked hashset1 : " +linkedhashset1);

	Set<Integer> linkedhashset2=new  LinkedHashSet<Integer>(); //linkedhashset2
	
	linkedhashset2.add(400);
	linkedhashset2.add(500);
	linkedhashset2.add(600);
	linkedhashset2.add(450);
	System.out.println("linked  hashset2: " +linkedhashset2);	
	
	linkedhashset2.addAll(linkedhashset1);
	System.out.println("adding linkedhashset1 to the linkedhashset2 ,and the result is " +linkedhashset2); //adding two Linkedhashsets
	
	Iterator iterator=linkedhashset2.iterator();
	while(iterator.hasNext()){
	System.out.println("Iterate over the LinkedHash set:"+iterator.next());
	}

	}
}