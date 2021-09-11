package week2;
//Practice class

public class Work5 {
	
	static class Player{
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Enemy enemy) {
			System.out.println("Player Attacks!");
			enemy.hp -= this.atk;
			System.out.println("Enemy hp : " + enemy.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	static class Enemy{
		String name;
		int hp;
		int atk;
		
		public Enemy(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Player player) {
			System.out.println("Enemy Attacks!");
			player.hp -= this.atk;
			System.out.println("Player hp : " + player.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}

	}

	public static void main(String[] args) {
		
		Player player = new Player("Hero", 100, 12); //생성자: class의 이름을 따라감
		Enemy enemy = new Enemy("Orc", 80, 5);
		
		while(player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if (!enemy.isLive()) break; //적이 죽었을 때 턴을 마치기 위한 장치
										//위 문장이 없을 시 적이 죽었어도 공격권이 넘어감
			enemy.attack(player);
			if (!player.isLive()) break; //(!player.isLive()) == (player.isLive() == false)
		}
		
		if (player.isLive()) {
			System.out.println("Player Win!");
		}
		else {
			System.out.println("Enemy Win!");
		}

	}

}
