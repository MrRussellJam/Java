

public abstract class SharedBike extends Bike{
    boolean isShared=false;
	public SharedBike(String anId) {
		super(anId);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	// True :  if free to be used
	// False : Somebody is used it
	public boolean toBeBorrowed(){
		if (this.isShared){
			return false;
		}
		//String id=this.getId();
		//String privateId=this.priveateId;
		this.isShared=true;
		return true;
	}
	public void toBeReturned(){
		this.isShared=false;
	
	}
	public abstract void toBePaid();
}
