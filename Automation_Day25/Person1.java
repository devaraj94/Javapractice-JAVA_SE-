	/**
	*this keyword is used to refer current class instance variable 
	*/

	public class Person1{

	String PatientName;
	int PatientAge;

	Person1(String PatientName,int PatientAge){
		this.PatientName=PatientName;
		this.PatientAge=PatientAge;
	}

	public void displayInfo(){
		System.out.println("The patientName : " +PatientName+ " ; PatientAge :"+PatientAge);
	}
	 public static void main(String args[]){

	Person1 person1Ref=new Person1("Rajesh" ,35);
	person1Ref.displayInfo();	
	 }
	}