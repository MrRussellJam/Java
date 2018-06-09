public class Humanbeing {
     Bike aBikeRidden=null;
     String name=null;
     String number=null;
     
	/**
	 * @param args
	 */
     
    public Humanbeing(String aName,String aNumber){
    	this.name=aName;
    	this.number=aNumber;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName="OShiGao";
		String studentNumber="170202100000";
		Humanbeing aPerson=new Humanbeing(studentName,studentNumber);
		String id="bike001";
		Bike aBike=new Bike(id);
		aPerson.ride(aBike);
		aPerson.printStatus();
	}
	public void ride(Bike aBike){
		aBikeRidden=aBike;
	}
	public void ride(Bike aBike, Humanbeing aPerson){
		
	}
	
	public void printStatus(){
		System.out.println("I am : "
				+this.name+", I am riding a bike with id : "
				+this.aBikeRidden.id+", and colored with :"
				+this.aBikeRidden.color);
	}

}
