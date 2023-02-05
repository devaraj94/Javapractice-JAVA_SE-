/**
*Vector is a Dynamic Array,It can hold objects of any type and any number.
*Vector is a legacy class and independent properties.
*vector is Synchronised. and ArrayList is not Synchronised.
*Synchronise-2nd object always should wait until the 1st Object completes Its Operation.
 
*/
import java.util.*;
import java.util.Vector.*;
public class Vectorexample{
	
	public static void main(String [] args){
		
		List<String> classificationvector=new Vector<String>();
		classificationvector.add("herbivores");
		classificationvector.add(1,"omnivores"); //index based adding
		
		System.out.println("classfication vector Intial: " +classificationvector);
		
		List<String> classificationvector2=new Vector<String>();
		classificationvector2.add("carnivores"); //adding two vectors
		
		classificationvector.addAll(classificationvector2);
		
        boolean containsfn=classificationvector.contains("omnivores"); //using contains function
		int hashCodeOfvector=classificationvector.hashCode();

		System.out.println("classfication vector final: " +classificationvector);
		System.out.println("Using contains function: " +containsfn+ "; HashCode of the Vector : " +hashCodeOfvector);
		
		Iterator<String> iterator=classificationvector.iterator();
		
		while(iterator.hasNext()){
			System.out.println("Iterate over classfication vector : " +iterator.next());
		}}}