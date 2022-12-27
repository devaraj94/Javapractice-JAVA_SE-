public class reverseastring {
	public static void main(String[] args) {
		String automationCourse = "KnosferQA_Program";
		int lengthref = automationCourse.length();
		System.out.println("length of letters :" + lengthref);

		/**
		 * char[] java.lang.String.toCharArray() 
		 * Converts this string to a new  character array. 
		 */

		char arrayref[] = automationCourse.toCharArray();
		for (int arraylength = 16; arraylength >= 0; arraylength--) {
			System.out.print(arrayref[arraylength]);
		}
	}

}
