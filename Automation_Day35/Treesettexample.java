//SortedSet-A Set that further provides a total ordering on its elements. 
//The elements are ordered using their natural ordering, 
import java.util.*;
public class Treesettexample{
	
	public static void main(String[]  args){
		
	SortedSet<Integer> treeset1=new  TreeSet<Integer>(); //Treeset1

	treeset1.add(100);
	treeset1.add(200);
	treeset1.add(300);
	treeset1.add(700);
	treeset1.add(300); //duplicate element included
	System.out.println("Treeset1 : " +treeset1);

	SortedSet<Integer> treeset2=new  TreeSet<Integer>(); //Treeset2
	
	treeset2.add(400);
	treeset2.add(500);
	treeset2.add(600);
	treeset2.add(450);
	System.out.println("Treeset2 : " +treeset2);	
	
	treeset2.addAll(treeset1);
	System.out.println("adding treeset1 to the treeset2 ,and the result is " +treeset2); //adding two Treesets
	
	Iterator iterator=treeset2.iterator();
	while(iterator.hasNext()){
	System.out.println("Iterate over the tree set:"+iterator.next());
	}

	}
}