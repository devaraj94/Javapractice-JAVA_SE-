/**
*using this keyword is used to invoke current class constructor.
*/

public class Person2{
	
	String name;
	int age;
	
	public Person2(){
		this("shivaraj",30);
	}
	
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void displayInfo(){
		System.out.println("Person name: " +name+ " ; person age : " +age);
		
	}
	
	public static void main (String [] args){
		Person2 person2ref=new Person2();
		person2ref.displayInfo();
		
	
	
	}
}
	
	