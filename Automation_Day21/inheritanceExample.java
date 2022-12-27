public class inheritanceExample{
	public static void main(String args[]){
		System.out.println("My name is Dev");
		human2 h2=new human2();
		h2.speak();
		h2.breath();
		h2.walk();
		h2.dance();
		h2.sleep();
	}
}
class human{
public void speak(){
		System.out.println("I am a good speaker");	
	}
	
public void walk(){
		System.out.println("i walk daily");
    }
 
public void breath(){
		System.out.println("i breath freely when im exposed to nature");
   }
}

class human2 extends human{	
public void dance(){
		System.out.println("i can Dance when i'm happy");
	}
	
public void sleep(){
		System.out.println("i sleep when im tired");
	}
}	
	