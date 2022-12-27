
public class objectcreationusingclone implements Cloneable{
	String studentName;
	int studentAge;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
	}
	public static void main(String args[]){
		 try{
			 
			 objectcreationusingclone ocuc1=new objectcreationusingclone();
			 ocuc1.studentName="Dev";
			 ocuc1.studentAge=28;
		
      objectcreationusingclone ocuc2=(objectcreationusingclone) ocuc1.clone();

			 System.out.println("clone from ocu1 for StudentName..." +ocuc2.studentName);
			 System.out.println("clone from ocuc1 for studentAge...."+ocuc2.studentAge);
		 }
		 catch(CloneNotSupportedException e){
			 e.printStackTrace();
			 
		 }
	}
}
			 