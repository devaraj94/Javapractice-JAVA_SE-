/**
*ArrayList-It is the class,which is used to store the object Dynamically.
*All the values stored in the arraylist are objects,if we try to add Primitive values,
  it will implicitly changes to objects by "Autoboxing"
*/
import java.util.*;

public class Arraylistexample{
	
	public static void main (String [] args){
	//1st arraylist and Finding size of the Arrays
		ArrayList<Object> List=new ArrayList<>();
		List.add(100);
		List.add(200);
		List.add(400);
		List.add(200);
		int sizeofArray1=List.size();
		
		//fetching the values from a List
		System.out.println("fetch List : "+List+ " ; And the Size of the Array1 : " +sizeofArray1);
		
		//2nd arraylist 
		ArrayList<Object> ListFinal=new ArrayList<>();
		ListFinal.add(700);
		ListFinal.add(900);
		
		
		//Adding Two arraylist and index level adding and Finding size of the two Arrays
		ListFinal.addAll(1, List);
		int sizeofTwoArrays=ListFinal.size();
		System.out.println("fetch ListFinal: "+ListFinal+ " ; And the Size of the two Arrays : " +sizeofTwoArrays);
		
		//getting hashcode
		int listhashCode=List.hashCode();
		int listfinalhashCode=ListFinal.hashCode();
		
		System.out.println("fetch List_hashcode : "+listhashCode);
		System.out.println("fetch listfinal_hashCode : "+listfinalhashCode);
		
		//remove the Index-01st element
		ListFinal.remove(1);
		System.out.println("after removing the element, ListFinal: "+ListFinal);
		
		Iterator<Object> iterator=ListFinal.iterator();
		
		while(iterator.hasNext()){
			System.out.println("Iterate over classfication vector : " +iterator.next());
		}
}}