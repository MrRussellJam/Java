
public class PlayerBag {
	int[][] capacity = new int[5][5];
	
	public static void main(String[] args) {
		
		
	}
	
	public void getGoods() {
		int i = 0;
		int j = 0;
		for(i = 0;i < 5;i++) {
			for(j = 0;j < 5;j++) {
				if(capacity[i][j] != 0) {
					putIn(capacity[i][j]);
				}
			}
		}
	}
	
	public int putIn(int empty) {
		//TODO make EquipData put in empty
		return empty;
	}
	
}
