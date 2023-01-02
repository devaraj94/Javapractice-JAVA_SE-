public class Lorry extends Vehicle{

Lorry(String model,String runPlatform){
super(model,runPlatform);
}

void start(){
	System.out.println(model+" Lorry Started on" +runPlatform);
}

void park(){
	System.out.println(model+" Lorry parked @" +runPlatform);
}


void stop(){
	System.out.println(model+"Lorry stoppped @ " +runPlatform);
}



}