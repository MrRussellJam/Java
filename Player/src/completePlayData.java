
public class completePlayData {
	
	
	public static void main(String[] args) {
	 
		Player firstPlayer = new Player();
		firstPlayer.getAttibute();
		System.out.println("玩家的姓名是:" + firstPlayer.name);
		System.out.println("玩家的性别是:" + firstPlayer.ID);
		System.out.println("玩家的属性为\n体质:" + firstPlayer.physique 
				+ "\n力量:" + firstPlayer.strong
				+ "\n敏捷:" + firstPlayer.agility);
		System.out.println("玩家的攻击力是:" + firstPlayer.attack);
		
 }
 
 
}
