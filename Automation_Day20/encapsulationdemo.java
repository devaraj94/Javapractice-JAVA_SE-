
/**

Encapsulation-Protecting our data

1.Declare a variable of a class as private,so that they cannot be accessed directly from outside of a class.
2.provide setter and getter methods that are declared as public ,to view and change the values of the variable.

*/

public class encapsulationdemo {
  
    private String geekName;
    private int geekRoll;
    private int geekAge;
	
	
	    public void setName(String newName)
			{
				geekName = newName;
			}
		
		public String getName() { 
			return geekName;
			}
 
		public void setRoll(int newRoll) { 
			geekRoll = newRoll;
			}
			
	    public int getRoll() { 
			return geekRoll;
			}
 
		public void setAge(int newAge) { 
				geekAge = newAge; 
				}

 
		public int getAge() { 
			return geekAge; 
			}

    
		
}
 


