
public class SharedBikeOfHello extends SharedBike{
	
	public static String bussiness = "Hello";
	
	public SharedBikeOfHello(String anID) {
		super(anID,bussiness);
	}

	
	/**
	 * 继承的抽象方法
	 */
	public void toBePaid() {
	//TODO how to paid	
	};
	
}
