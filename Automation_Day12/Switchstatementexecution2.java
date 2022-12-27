public class Switchstatementexecution2{
	
	public static void main (String args[] ){
		
		String healthcondition="cold";
		
		
		switch (healthcondition){
			
			case "fever" ->System.out.println("take a dolo 650 tablet and take bed rest...");
			
			case "cold" ->System.out.println("take a paracetamol tablet and take bed rest...");
			
			case "headache"->System.out.println("take a Crocin Pain Relief  tablet and take bed rest...");
			
			default ->System.out.println("Nothing works....");
		}
	}
}
