	/**
	*using this keyword to return the current class instance

	*/

	public class Person3{
	 String name;
	 int age;
	 
	 Person3(){
	 this("shivu",30);
	 }
	 
	 Person3(String name,int age){
	 this.name=name;
	 this.age=age;
	 
	 }
	 
	public void displayInf(){
		System.out.println("Person name : " +name+" ; person age : " +age);
	}

	public Person3 call(){
		return this;
	}



	public static void main(String args[]){

	Person3 person=new Person3();
	person.call().displayInf();
	
	}
	
	}