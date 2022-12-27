	public class Staticexample{
		
		
		
		static {
		System.out.println("i am at static block");
		}
		
        static String staticvariable = staticmethod();
		
        static String staticmethod() {
		System.out.println("i am at static method");
		return staticvariable;
		}
		


		public static void main(String[] args){
		}

		
	}