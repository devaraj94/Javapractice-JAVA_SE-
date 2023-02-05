//Que-->First In,First out
//Stack-> Last IN,First Out
import java.util.*;
public class DequeExample{
	public static void main (String [] args){
			
Deque<String> patientsregister=new ArrayDeque<String>();
	//adding patients to arrayDeque
	patientsregister.offer("Rajesh");
	patientsregister.offer("Mahesh");
	patientsregister.offer("Dinesh");
	patientsregister.offer("Suresh");
	patientsregister.offer("Devaraj");
	patientsregister.offer("Anup");

	System.out.println("The Registered patients :");
	System.out.println(patientsregister);
	//geting First and last patient from ArrayDeque

	String firstPatient=patientsregister.peekFirst();
	String lastPatient=patientsregister.peekLast();
	System.out.println("The Registered firstPatient :"+firstPatient);
	System.out.println("The Registered lastPatient :"+lastPatient);

	//Removing First and last patient from ArrayDeque
	String removeFirstPatient=patientsregister.pollFirst();
	String removeLarstPatient=patientsregister.pollLast();
	System.out.println("The removing First Patient :"+removeFirstPatient);
	System.out.println("The removing last Patient :"+removeLarstPatient);	
					
	System.out.println("The Final avaialable Registered patients :");
	System.out.println(patientsregister);		
		
	}}


