package week2;
//Practice class extends - Main

public class Work6 {
	
	public static void main(String[] args) {
		
		PlayerCharacter player = new PlayerCharacter("Holy Knight", 70, 12); //������: class�� �̸��� ����
		EnemyCharacter enemy = new EnemyCharacter("Orc", 80, 5);
		
		while(player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if (!enemy.isLive()) break; 
			
			enemy.attack(player);
			if (!player.isLive()) break;
			System.out.println("--------------------");
		}
		
		if (player.isLive()) {
			System.out.println("Player Win!");
		}
		else {
			System.out.println("Enemy Win!");
		}

	}


}
