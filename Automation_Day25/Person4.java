	/**
	*using this keyword is used for method parameter.
	*/

	public class Person4{

	String name;
	int age;


	Person4(){
		this("anup",36);
	}

	Person4(String name,int age){
		this.name=name;
		this.age=age;
	}

	public void displayInfo(Person4 person){
		System.out.println("Person name :"+person.name+" ; person age : " +person.age);
	}

	public void get(){
		displayInfo(this);
	}

	public static void main(String args[]){
	Person4 personref=new Person4();
	personref.get();
	}
	}