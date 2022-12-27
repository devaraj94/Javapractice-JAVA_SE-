public class Mainclass{
	
	static String Programminglang="Java";
	
	
	public static class nestedclass{
		
	public void displaymethod(){
	System.out.println("I am learning "+Programminglang+" Programming  language");
	
		}
		
	}
	
	public static void main(String args[]){
		
		Mainclass.nestedclass mnec= new Mainclass.nestedclass();
		mnec.displaymethod();

	}
	
}