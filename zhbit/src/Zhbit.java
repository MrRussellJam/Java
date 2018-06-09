public class Zhbit {
	Humanbeing aListOfPerson []=null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String s=  "I am hjjhjhjhjh Zhbit hjjhhjhjhjhj ";
		//System.out.print(s);
		//System.exit(1);
		
		
		int debug=0;

		SharedBikeOfLittleGreen c = new SharedBikeOfLittleGreen();
		SharedBike b = new SharedBikeOfLittleGreen("123");
		
		String whatLabel=Bike.manufactoryLabel;
		
		Bike.manufactoryLabel="jhjhhj";
		// Person a
		Humanbeing aPerson=new Humanbeing("Person a");
		SharedBikeOfLittleGreen aBike=new SharedBikeOfLittleGreen("bike001");
		aBike.personScanCard();
		aPerson.ride(aBike);
		
		String whatLabelA=aBike.manufactoryLabel;

		// Person b
		Humanbeing bPerson=new Humanbeing("Person b");
		Bike bBike=new Bike("bike002");
		bPerson.ride(bBike);

		String whatLabelB=aBike.manufactoryLabel;
		
		// Person c
		Humanbeing cPerson=new Humanbeing("Person c");
		Bike cBike=new Bike("bike003");
		cPerson.ride(cBike);
		
		Humanbeing dPerson=new Humanbeing("Person d");
		Bike dBike=new Bike("bike004");
		dPerson.ride(dBike);
		
		//
		Zhbit zhbit=new Zhbit();
		// start to go to Java course
		zhbit.aListOfPerson=new Humanbeing[4];
		
		zhbit.aListOfPerson[0]=aPerson;
		zhbit.aListOfPerson[1]=bPerson;
		zhbit.aListOfPerson[2]=cPerson;
		zhbit.aListOfPerson[3]=dPerson;
		
		
		debug=1;
		
		Bike fBike = new SharedBikeOfOfO("bike007");
		
		System.out.println(fBike.id);
		
		
		
	}

}
