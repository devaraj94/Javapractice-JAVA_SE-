public class Jobpositionforloop{
	
	public static void main(String args[]){
		
for(int Jobposition=1;Jobposition<=14;Jobposition++){
	
	if(Jobposition==9){       
		break;         //print up to 8 jobposition
	}
	System.out.println("im trying for the job " +Jobposition  + "__positions");
  }
		
for(int monthlyactivity=15;monthlyactivity>=1;monthlyactivity--){
	
	if (monthlyactivity==6){
		continue; //skipping the monthlyactivity=6th day
	}
	System.out.println("My Monthlyactivity in remaining days.."+monthlyactivity + "days");
				
		}
	}	
}
