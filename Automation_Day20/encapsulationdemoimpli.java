public class encapsulationdemoimpli {
    public static void main(String[] args)
    {
	 encapsulationdemo encapsulationdemoref=new encapsulationdemo();
			encapsulationdemoref.setName("Harsh");
			encapsulationdemoref.setAge(19);
			encapsulationdemoref.setRoll(51);
	 
			System.out.println("Geek's name: " + encapsulationdemoref.getName());
			System.out.println("Geek's age: " + encapsulationdemoref.getAge());
			System.out.println("Geek's roll: " + encapsulationdemoref.getRoll());
    }
}
