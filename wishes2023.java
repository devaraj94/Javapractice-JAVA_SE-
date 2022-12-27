import java.util.Scanner;
public class wishes2023{	
public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a year:");
	System.out.println("wishes:");

    String yearwishes = myObj.nextLine();  // Read user input
    System.out.println("Year is: " + yearwishes);  // Output user input
	System.out.println("wish You happy new year: " + yearwishes);

		wishes2 w2 = new wishes2();
		w2.newyearwish(2023);

		String day = "Saturday";
		
		switch (day) {

		case "Monday", "Tuesday", "Wednesday"->System.out.println(day+ ":work @client location");

		case "Thursday", "Friday" ->System.out.println(day+ ":work from Home");

		case "Saturday" ->System.out.println(day+ ":team outing");
		
		default->System.out.println(day+ ":week off day");
		}}
}
class wishes2 {

	void newyearwish(int year) {
		switch (year) {

		case 2020, 2021, 2022 -> System.out.println(year+":Happy new Year team (OLD_WISHES)");

		case 2023 -> System.out.println(year+":Happy new Year 2023");

		default -> System.out.println(year+":Happy new year Default");
}
		}}
