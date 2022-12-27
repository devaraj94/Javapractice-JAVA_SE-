public class Objectcrestionusingnewinstance{
	
	String employeeName;
	int employeeSalary;
	
	public static void main(String [] args){
		try{
		Class cls = Class.forName("Objectcrestionusingnewinstance");
		Objectcrestionusingnewinstance obj = (Objectcrestionusingnewinstance)cls.newInstance();
	
		obj.employeeName="Shivu";
		obj.employeeSalary=56344;
		
		System.out.println("Employee_name:" +obj.employeeName  + 
		"  & Employee salary is...   "  +obj.employeeSalary+ " rupees");
	}
	catch(Exception e){
       e.getStackTrace();
	}}
}
	