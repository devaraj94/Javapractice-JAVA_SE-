public class objectcreationusingnew{
	
	String myname=""; //global variables
	int myAge;
	
	public static void main(String args[]){
		
		objectcreationusingnew obj=new objectcreationusingnew();
		String setName=obj.myname="Dev";
		int setAge=obj.myAge=28;
		
		System.out.println("my name is ..." +setName+" and my age is .."+setAge);
		
		
	}
}
