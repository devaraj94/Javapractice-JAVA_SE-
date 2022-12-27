public class mybodytemperaturedowhile{
	
	public static void main(String args[]){
		
		int mybodytemperature=36;
		int fevertemperature=40;
		
		do {
			System.out.println(" I am feeling good and no fever..." +mybodytemperature +" degrees");
			mybodytemperature++;
		}
		while(mybodytemperature<fevertemperature);{
			System.out.println("I am not feeling well, need to take tablets and take bed rest..." +mybodytemperature +" degrees");
		}
	}
}