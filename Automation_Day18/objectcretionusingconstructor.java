import java.lang.reflect.*;
public class objectcretionusingconstructor{
	
	
	String studentName;
	int studentAge;
	
	public static void main (String args[]){
		try{
			
			Constructor <objectcretionusingconstructor> constructorRef=objectcretionusingconstructor.class.getConstructor();
			
			objectcretionusingconstructor ocuc=constructorRef.newInstance();
			
			
			ocuc.studentName="Rajesh";
			ocuc.studentAge=35;
			
			System.out.println(ocuc.studentName);
			System.out.println(ocuc.studentAge);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
}