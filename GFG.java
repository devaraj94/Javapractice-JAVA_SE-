
// Java program to demonstrate
// codePoints() method of IntStream class
  
import java.util.stream.IntStream;
  
public class GFG {
    public static void main(String args[])
    {
  
        // String to be converted
        String str = "GeeksForGeeks";
  
        // Convert the string to code values
        // using codePoints() method
        IntStream stream = str.codePoints();
  
        System.out.println("ASCII Values are: ");
  
        // Print the code points
        //stream.forEach(System.out::println);
    }
}