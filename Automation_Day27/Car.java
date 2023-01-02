public class Car extends Vehicle{

Car(String model,String runPlatform){
super(model,runPlatform);
}

void start(){
	System.out.println(model+" car started on "+runPlatform);
}

void park(){
	System.out.println(model+" car parked @ "+runPlatform);
}

void stop(){
	System.out.println(model+" car stopped @ "+runPlatform);
}

}