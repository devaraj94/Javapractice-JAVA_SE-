
	//ArrayList- best for set/get operation.
	//LinkedList-best for add/remove operation.

	import java.util.*;
	import java.lang.*;

 public class ArraylistvsLinkedlist{
		
	public static void main(String[] args){
		
	ArrayList<Integer> arraylist=new ArrayList<Integer>();
	LinkedList<Integer> linkedlist=new LinkedList<Integer>();

	//arraylist for add operation.
	long startTime=System.nanoTime();
		for(int counter=0;counter<100000;counter++){
			arraylist.add(counter);
		}
		
	long endTime=System.nanoTime();

	long diffDuration=endTime-startTime;	
		System.out.println("Time taken for arraylist add operation: "+diffDuration);
		
	//linkedlist for add operation.
	startTime=System.nanoTime();
		for(int counter=0;counter<100000;counter++){
			linkedlist.add(counter);
		}
		
	endTime=System.nanoTime();

	diffDuration=endTime-startTime;	
		System.out.println("Time taken for Linkedlist add operation: "+diffDuration);
		
System.out.println("From the Example its shows that LinkedList-best for add/remove operation.");
		
		//arraylist for get operation
	startTime=System.nanoTime();
		for(int counter=0;counter<100000;counter++){
			arraylist.get(counter);
		}
		
	 endTime=System.nanoTime();

	diffDuration=endTime-startTime;	
		System.out.println("Time taken for arraylist get operation: "+diffDuration);
		
	//linkedlist for get operation
	startTime=System.nanoTime();
	for(int counter=0;counter<100000;counter++){
		linkedlist.get(counter);
		}
		
	endTime=System.nanoTime();

	diffDuration=endTime-startTime;	
		System.out.println("Time taken for Linkedlist get operation: "+diffDuration);

System.out.println("From the Example its shows that ArrayList- best for set/get operation.");
	}
	}
