 public class testEncapsimplementation{
	 
	 
	 public static void main (String args[]){
		 
		 testEncaps testEncapsref=new testEncaps();
		 testEncapsref.setpatientName("Deva");
		 testEncapsref.setpatientAge(27);
		 testEncapsref.setpatientorigin("Shimoga");
		 
		 
		 System.out.println("admitted patient name is "+testEncapsref.getpatientName());
		 System.out.println("admitted patient age is "+testEncapsref.getpatientAge());
		 System.out.println("admitted patient's origin is "+testEncapsref.getpatientorigin());
		 
		 
	 }
	 
 }