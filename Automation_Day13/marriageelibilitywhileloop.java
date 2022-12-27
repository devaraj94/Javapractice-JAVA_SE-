public class marriageelibilitywhileloop{
	
	public static void main (String args[]){
		
		int eligibleforMarriage=21;
		int myAge=17;
		
		
		while(myAge<eligibleforMarriage){
			
			System.out.println("I am not eligible for Marriage as my age is... " +myAge);
			myAge++;
		}
		
		System.out.println("I am eligible for marriage and now my age is ...."+myAge);
	}
	
}