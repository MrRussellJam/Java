

public class Bike {
	
    public String id=null;
    public String bussiness = null;
    public static  String manufactoryLabel="PaiZhi";
    @SuppressWarnings("unused")
	private String priveateId="private Id";
    public String color=null;
    
    int speed=0;
	/**
	 * @param args
	 */
    public Bike() {
    	//构造默认函数
    }
    
    public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		}
		
	public Bike(String anId){
			this.id=anId;
		}
	
	public Bike(String anID,String bussiness){
		this.id = anID;
		this.bussiness = bussiness;
	}
		
	/*
	 * public Bike(String anId,String aColor){
			this.id=anId;
			this.color=aColor;
		}
		*/
	public String getId(){
			return this.id;
		}
		
	public String getColor(){
			return this.color;
		}
		
	public int speedUp(int newSpeed){
			this.speed=newSpeed;
			return this.speed;
		}
	
	
}
