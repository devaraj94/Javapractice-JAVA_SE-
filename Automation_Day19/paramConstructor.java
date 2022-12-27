public class paramConstructor {
	
	String patientName;
	int patientAge;
	
	public paramConstructor(){
		System.out.println("I am @ noArgconstructor block");
		this.patientName="Vinay";
		this.patientAge=55;
	}
	
	public paramConstructor(String patientName,int patientAge){
		
		System.out.println("I am @ parameterised constructor");
        this.patientName=patientName;
		this.patientAge=patientAge;	
	}
	
	
	public static void main (String args[]){
		
		System.out.println("I am Passing Basic level Test");
		paramConstructor nac2=new paramConstructor();
		System.out.println("Noarg_construtor block Patient name:" +nac2.patientName+" and their age:" +nac2.patientAge+"yars");
		
		paramConstructor nac=new paramConstructor("Divakar",42);
		System.out.println("param_Constructor patient name :"+nac.patientName+ " and their age:" +nac.patientAge+"years");	
	}
}
