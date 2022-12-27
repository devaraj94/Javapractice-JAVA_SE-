public class defaultConstructor{
	
	String studentName;
	int studentAge;
	
	
	public static void main (String args[]){
		
		defaultConstructor df=new defaultConstructor();
		df.studentName="shivaraj";
		df.studentAge=31;
		System.out.println(df.studentName+ " and " +df.studentAge); 
		
	}
}