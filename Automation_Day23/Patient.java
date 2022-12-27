public class Patient{
	
	int PatientID;
	String PatientName;
	int PatientBill;
	String PatientDiagnosis;
	Address PatientAddress;
	
	Patient(int PatientID,String PatientName,int PatientBill,String PatientDiagnosis,Address PatientAddress){
	this.PatientID=PatientID;
	this.PatientName=PatientName;
    this.PatientBill=PatientBill;
	this.PatientDiagnosis=PatientDiagnosis;
	this.PatientAddress=PatientAddress;
	}
	
	void patientDataDisplay(){
		System.out.println("PatientID :" +PatientID);
		System.out.println("PatientName : " +PatientName);
		System.out.println("PatientBill  : "+PatientBill);
		System.out.println("PatientDiagnosis : " +PatientDiagnosis);
		System.out.println("Patient place  : "+PatientAddress.City);
	}
	public static void main (String [] args){
		
		Address PatientAddress=new Address("Bangalore","Karnataka","India");
		
		Patient PatientData=new Patient(4026,"Dev",50000,"HeartSurgery",PatientAddress);
		
		PatientData.patientDataDisplay();
			
	}}
