	/**
	*using this keyword to invoke current class.
	*/

	public class Person5{
		
		String name;
		int age;
		
		Person5(){
			this("Wajeda",27);	
		}
		
		Person5(String name,int age){
		this.name=name;
		this.age=age;
		}

		public void displayinfo(Person5 person){
			System.out.println("person name : " +person.name+ " ; person age : " +person.age);
		}
		
		 public void  get(){
			 displayinfo(this);
		 }
		 
		public Person5 thisclassObjecct(){
		return this;	
		}

		public static void main (String [] args){
		
		Person5 personref=new Person5();
		personref.thisclassObjecct().get();
		}
		
	}
