public class Humanbeing {
     Bike aBikeRidden=null;
     String name=null;
	/**
	 * @param args
	 */
    public Humanbeing(String aName){
    	this.name=aName;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName="OShiGao";
		Humanbeing aPerson=new Humanbeing(studentName);
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
