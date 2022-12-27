	public class Charges implements Hospitalexpences{

	String month;
	int Admitcharge;
	int ambulanceService_Intial;
	int Scanningcharges;
	int ambulanceService_Final;
	int OperationCharges;
	
	public static void main(String args[]){
		Charges ChargesRef=new Charges();
		ChargesRef.HospitalBedcharges();
		ChargesRef.HospitalScanningCharges();
		ChargesRef.HospitalOperationCharges();
	}

	public void HospitalBedcharges(){
		Admitcharge=500;
		ambulanceService_Intial=2000;
		month="June";
		int HospitalBedChargesBill=Admitcharge+ambulanceService_Intial;
		System.out.println(month+" month of HospitalBedCharges is : " +HospitalBedChargesBill+" Rupees" );
	}


	public void HospitalScanningCharges(){
		ambulanceService_Final=2500;
		Scanningcharges=3500;
		month="June";
		int HospitalScanningChargesBill=ambulanceService_Final+Scanningcharges;
		System.out.println(month+" month of HospitalScanningCharges is : "+Scanningcharges+" Rupees");
	}


	public void HospitalOperationCharges(){
		OperationCharges=50000;
		ambulanceService_Final=3500;
		int HospitalOperationChargesBill=OperationCharges+ambulanceService_Final;
		System.out.println("Total HospitalOperationCharges is : " +HospitalOperationChargesBill+" Rupees" );	
	}
	}