
public class Player{
	int attack;
	int strong;
	int agility;
	int physique;
	String name;
	char sex;
	int ID;

	public static void main(String[] args) {
		new Player().getAttibute();
		
		
	}
	
	public void getAttibute(){
		this.strong = (int)(1 + Math.random()*10);
		this.agility = (int)(1 + Math.random()*10);
		this.physique = (int)(1 + Math.random()*10);
		this.attack = this.strong*2 - 1;
	}
	
	public char getSex(char sex) {
		this.sex = sex;
		return sex;
	}
	
	public String getName(String name) {
		this.name = name;
		return this.name;
	}
	
	public int returnID() {
		this.ID = (int) (1 + Math.random());
		return ID;
	}
	
}
