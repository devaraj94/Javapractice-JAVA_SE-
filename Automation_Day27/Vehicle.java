  public abstract class Vehicle{
	
	public String model;
	public String runPlatform;
		
	Vehicle(String model,String runPlatform){
		this.model=model;
		this.runPlatform=runPlatform;
	}
		
	abstract void start();
    abstract void stop();
    abstract void park();

   public void honk(){
   System.out.println("Honked....");
   }	
			
	}