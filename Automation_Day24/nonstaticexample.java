public class nonstaticexample{
	
	{
		System.out.println("I am @ non static variable");
	}
	
	public void nestednonstatic(){
		System.out.println("I am @ nestednonstatic ");
	}
	
	String nonstaticvariable=callingnonstatic();
	
	public String callingnonstatic(){
		System.out.println("I am calling nonstatic methods  ");
	    return "";
	}
	
	public static void main(String args[]){
		
		nonstaticexample nse=new nonstaticexample();
		nse.nestednonstatic();
	
}
}