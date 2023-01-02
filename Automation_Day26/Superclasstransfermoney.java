public class Superclasstransfermoney{
	
	public static void main(String [] args){
		googlepay gpay=new googlepay();
		gpay.payment();
	}
}

class paybills{
	int amount=300;
	
	paybills(int price){
		System.out.println("i am at parent class parameter constructor ,Price : " +price+ " rupees");
	}
	
	void payment(){
		System.out.println("Send MoneyHome,recharge mobile,Do sip transactions");
	}	
}
	
	
class googlepay extends paybills{
	int amount =100;
	
	googlepay(){
		super(200);
		System.out.println("i am at child class constructor");
	}
	
	void payment(){
		super.payment();
		System.out.println("Do direct bank to bank transfer:  "+amount+ " rupees");
	
	System.out.println("parent amount : " +super.amount + " rupees");
}}	
	
	
	
	
	
	
	
	
	