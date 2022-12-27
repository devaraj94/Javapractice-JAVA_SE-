	public class car{
		
		private String carName;
		private int carMaxspeed;
		private String carOwner;
		
		public void setcarName(String carName){
		this.carName=carName;
		}

		public String getcarName(){
		System.out.println("The car name is : " +carName);
		return carName;
		}

		public void setcarMaxspeed(int carMaxspeed){
		this.carMaxspeed=carMaxspeed;
		}
		
		public int getcarMaxspeed(){
		System.out.println("The maximum Speed of the car is : " +carMaxspeed+"km/hr");
		return carMaxspeed;
		}
		
		public void setcarOwner(String carOwner){
		this.carOwner=carOwner;
		}
		
		public String getcarOwner(){
		System.out.println("The owner of the car : " +carOwner);
		return carOwner;
		}

	}