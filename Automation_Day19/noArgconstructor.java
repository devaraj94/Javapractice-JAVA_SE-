

public class noArgconstructor extends defaultConstructor{
	
	String employeeName;
	int employeeAge;
	
	public noArgconstructor (){
		
	this.employeeName="Dinesh";
	this.employeeAge=28;
	
	}
	
	public static void main (String args[]){
		
		System.out.println("I am @ noArgconstructor ");
		
		noArgconstructor nac=new noArgconstructor();
		System.out.println("I am @  No_Arguement constructor ");
		System.out.println("Employee Name is.." +nac.employeeName);
		System.out.println("Employee Age is.."+nac.employeeAge);
		
		
		defaultConstructor df=new defaultConstructor();
		df.studentName="Rajesh";
		df.studentAge=35;
		System.out.println("I am @  Default constructor ");
		System.out.println("Student name: " +df.studentName + " and his/her age is " +df.studentAge);
	}
}