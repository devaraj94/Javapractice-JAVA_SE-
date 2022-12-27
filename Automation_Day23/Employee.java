	public class Employee{

	int EmployeeID;
	String EmployeeName;
	String EmployeePhone;
	Address EmployeeAddress;

	Employee(int EmployeeID,String EmployeeName,String EmployeePhone,Address EmployeeAddress){
		this.EmployeeID=EmployeeID;
		this.EmployeeName=EmployeeName;
		this.EmployeePhone=EmployeePhone;
		this.EmployeeAddress=EmployeeAddress;
	}
	void EmployeeDatadisplay(){
		System.out.println("EmployeeID :" +EmployeeID);
		System.out.println("EmployeeName : " +EmployeeName);
		System.out.println("EmployeePhone  : "+EmployeePhone);
		System.out.println("Employee country : " +EmployeeAddress.Country);
	}
	public static void main(String [] args){
		
		Address tempAddress=new Address("Shivamogga","Karnataka","India");
		Address permanentAddress=new Address("Bangalore","Karnataka","India");
		
		Employee Employee1=new Employee(4076,"Devaraj","9590123456",tempAddress);
		
		Employee Employee2=new Employee(4076,"Devaraj","9590123456",permanentAddress);
		
		Employee1.EmployeeDatadisplay();
		
		
		
	}

	}
		




